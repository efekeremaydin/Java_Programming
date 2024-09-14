package day33_abstraction;

import day32_finalKeyword.PersonTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person { // this class can't be inherited now

    private final int id; // final is to make it unchangeable
    // any var that is final needs to be inst before using them
    private String batchName; // this should not be final as it needs to change
    private int batchNumber; // this should not be final as it needs to change
    public final static String programmingLanguage;

    static {
        programmingLanguage = "Java";
    }



    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, int id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth); // below cond can only be given after the age is set
        // since age has not setter (it's final) cond can only be given in the const. otherwise if you have a setter you should always provide cond via setter
        if (getAge()<18){ // if the age is set to less than 18
            System.err.println("Invalid age: " + getAge());
            System.exit(1);
        }
        /*if (LocalDate.now().getYear()-dateOfBirth.getYear()<18) {
            System.err.println("Invalid age: " + getAge());
            System.exit(1);
        }*/
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    public int getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        }else{ // otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + "\n No such a batch in Cydeo");
            System.exit(1);
        }
      /*  if (!(batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev"))) {
            System.err.println("Invalid batch name: " +batchName);
            System.exit(1);
        }else{
        this.batchName = batchName;*/
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        /*if (batchNumber>0){
            this.batchNumber = batchNumber;
        }else{
            System.err.println("Invalid batch number: " + batchNumber);
        }*/

        if(batchNumber <= 0) {
            System.err.println("Invalid batch number: " + batchNumber + "\nBatch number cannot be negative or zero");
            System.exit(1);
        }else{
            this.batchNumber = batchNumber;
        }

    }

   /* @Override
    public int getAge() {
        if (getAge()<18){
            System.err.println("invalid age");
            System.exit(1);
        }
        return super.getAge();
    }*/



    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " dreaming of " + programmingLanguage + " while speelping");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id=" + id +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }

  /*  @Override
    public LocalDate getDateOfBirth() {
        if (LocalDate.now().getYear() - getDateOfBirth().getYear() < 18){
            System.err.println("Invalid age" + getAge());
        }
        return super.getDateOfBirth();
    }*/
}

/*
Warmup tasks:
	1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables

 */
