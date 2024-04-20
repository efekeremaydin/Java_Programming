package day25_constructors;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPractices {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

       

        // 1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
/*        for (Dog each : dogs) {
            if(each.size.equals("Small")){
                smallDogs.add(each);
            }
        }
        System.out.println("smallDogs = " + smallDogs);*/
        //smallDogs.addAll(Arrays.asList(dogs));
        smallDogs.removeIf(p -> !p.size.equals("Small"));// predicate is functional interfaces that allows you to create your own conditon
        System.out.println("smallDogs = " + smallDogs);

        //  1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
 /*       for (Dog each : dogs) {
            if (each.age<=4){
                youngDogs.add(each);
            }
        }*/
        //youngDogs.addAll(Arrays.asList(dogs));
        youngDogs.removeIf(p -> p.age>4);
        System.out.println("youngDogs = " + youngDogs);

        //  1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        //femaleDogs.addAll(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender=='M');
        System.out.println("femaleDogs = " + femaleDogs);


        // 1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        //maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeIf(p -> p.gender=='F');
        System.out.println("maleDogs = " + femaleDogs);

        System.out.println("---");

        // keep as an array, don't use Array List and remove small dogs, in the new dogs array you need to have less dogs (small ones deleted).

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));
        list.removeIf(p -> p.size.equals("Small"));
        System.out.println(list);

        dogs2 = list.toArray(new Dog[list.size()]); // you can also give array size 0
        System.out.println(Arrays.toString(dogs2));
        //System.out.println(Arrays.toString(list.toArray()));
/*        Dog[] dogs3 = new Dog[dogs2.length];

        for (int i = 0; i < dogs2.length; i++) {
            if (!(dogs2[i].size.equals("Small"))){
//                if (dogs2[i] == null){
//                    break;
//                }
                dogs3[i] = dogs2[i];
            }

        }
        System.out.println(Arrays.toString(dogs3));

 */


    }
}

/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops

 */