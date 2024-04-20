package day28_encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person("Efe"); // each of these obj are diff

        Person person1 = new Person("Mohammad");

        Person person2 = new Person("Abidullah", 'M');

        Person person3 = new Person("Hasan", 30);

        Person person4 = new Person("Daniel", "English");

        Person person5 = new Person("Tatiana", 25, 'F');

        Person person6 = new Person("Lucy", 31, 'F', "English");

        person4.name = "James"; // only person4 name will change

        //person1.planet = "Mars"; // should not be called via obj
        //Person.planet = "Mars"; // call static var via class

        System.out.println(p1);

        p1.eat("fish");
        p1.drink("water");

        //p1.printPlanetName("Earth");
        Person.printPlanetName();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat("Baklava");

        person2.drink("Water");

        person5.drink("Tea");

        person6.drink("Coffee");

        // INST IS FOR OBJ AND EACH OBJ HAS ITS OWN MEM













    }
}
