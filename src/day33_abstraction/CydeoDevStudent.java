package day33_abstraction;

import day32_finalKeyword.PersonTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final int id;
    private String batchName;
    private int batchNumber;
    private final static String programmingLanguage;

    static {
        programmingLanguage = "Java";
    }



    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, int id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
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
        if (!(batchName.equals("Zero to Hero") || batchName.equals("Alumni Dev"))) {
            System.err.println("Invalid batch name" +batchName);
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0) {
            System.err.println("Invalid batch number" + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
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
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "id=" + id +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }

    @Override
    public LocalDate getDateOfBirth() {
        if (getDateOfBirth().getYear() >)
        return super.getDateOfBirth();
    }
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
