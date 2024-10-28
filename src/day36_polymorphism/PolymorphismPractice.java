package day36_polymorphism;

import day30_inheritance.phoneTask.*;

public class PolymorphismPractice {


   /* @Override
    public boolean equals(Object obj) { // equals m actually uses pm. any obj you pass can use the obj parameter
        return super.equals(obj);
    }*/

    public static void main(String[] args) {

        // IPhone phone = new Phone("Iphone 11 Pro", "Large", 900, "Black"); // child can't ref to parent
        //Phone phone = new IPhone("Iphone 11 Pro", "Large", 900, "Black"); // parent can ref to child



        Phone[] phones = { // PM -> parent to be the ref type of array to store child classes
                new IPhone("Iphone 11 Pro", "Large", 900, "Black"),
                new IPhone("Iphone 12 Pro Max", "Large", 1200, "White"),
                new IPhone("Iphone 9", "Medium", 800, "Gold"),
                new Samsung("Galaxy S19", "Medium", 700, "Pink"),
                new Samsung("Galaxy S20", "Large", 950, "Silver"),
                new Samsung("Galaxy S21", "Large", 950, "Black"),
                new Nokia("XR20", "Small", 350, "Black"),
                new Nokia("G10", "Medium", 99, "Pink"),
                new Nokia("G50", "Large", 250, "Silver"),
                new IPhone("Iphone 12 Pro", "Large", 1200, "Silver"),
                new IPhone("Iphone 11 Pro Max", "Large", 1100, "White"),
                new Samsung("Galaxy S18", "Medium", 750, "White"),
                new Samsung("Galaxy S17", "Large", 650, "White"),
                new Nokia("G10", "Medium", 99, "Black"),
                new IPhone("Iphone 6", "Smalle", 400, "Gold"),
                new IPhone("Iphone 7", "Smalle", 500, "Gold")
        };



        for (Phone eachPhone : phones) { // right side should be the array to iterate and left side should be the parent ref type ( can't be child ref type for example, Samsung, cuz not all the ref types are Samsung)
            // larger ref type can't be assigned to smaller ref type
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        System.out.println("---");

        int countIPhone = 0;
        int countSamsung = 0;

        for (Phone each : phones) {
            if (each instanceof IPhone) { // if Phone is IPhone
                countIPhone++;
            }
            if (each instanceof Samsung) { // if Phone is Samsung
                countSamsung++;
            }
        }

        System.out.println("countIPhone = " + countIPhone);
        System.out.println("countSamsung = " + countSamsung);

        System.out.println("---");

        for (Phone each : phones) {

           /* if (each.getPrice() > 700) {

                System.out.println(each.getModel() + " " + each.getPrice());
            }*/

            if (each instanceof IPhone || each instanceof Samsung) { // if the phone is iPhone or Samsung
                if (each.getPrice() >= 700){ // from each phone under this condition i will get price
                    System.out.println(each.getModel() +  " - " + each.getPrice());
                }
            }
        }

        // == this compares the obj from the mem allocation
        // in order to use .equals() in our own customised objects we need to know polymorphism













    }








}


/*
Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Red", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };

         1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater

 */