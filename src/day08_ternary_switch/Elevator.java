package day08_ternary_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 3;

        String floor = "Invalid Floor";
/*
        if (floorNumber >= 1 && floorNumber <= 3) {
            if (floorNumber == 1) {
                floor = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                floor = "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            } else
                floor = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
        } else {
            System.out.println("Invalid floor");
        }
        System.out.println(floor);

 */

        if (floorNumber >= 1 && floorNumber <= 3) {
            floor = "Floor " + floorNumber + " selected. Companies: ";
            if (floorNumber == 1) {
                floor += "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                floor += "Cydeo, NASA, Intelsat";
            } else {
                floor += "Lyft, BofA, Stake house";
            }
        }

            System.out.println(floor);
        }
    }






/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
 */