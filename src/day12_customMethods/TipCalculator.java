package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

// my solution

        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String split = input.next().toLowerCase(); // to ignore case sensitivity

        if (split.equals("yes")){
            System.out.println("Enter the number of people (number)");
            int people = input.nextInt();

            System.out.println("Enter the check amount (number)");
            int check = input.nextInt();

            System.out.println("Service Quality (String)");
            String quality = input.next().toLowerCase();

            input.close();

            double qualityPercentage = 0;

            switch (quality){
                case "poor":
                    qualityPercentage = 0.05;
                    break;
                case "fair":
                    qualityPercentage = 0.10;
                    break;
                case "good":
                    qualityPercentage = 0.15;
                    break;
                case "great":
                    qualityPercentage = 0.20;
                    break;
                case "excellent":
                    qualityPercentage = 0.25;
                    break;
            }

            double totalTip = check * qualityPercentage;
            double totalPay = check + totalTip;
            double totalPerPerson = totalPay/people;
            double totalTipPerPerson = totalTip/people;

            System.out.println("Number of people entered: " + people);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + totalTipPerPerson);

        } else {
            System.out.println("Enter the number of people (number)");
            int people = input.nextInt();

            System.out.println("Enter the check amount (number)");
            int check = input.nextInt();

            System.out.println("Service Quality (String)");
            String quality = input.next().toLowerCase();

            input.close();

            double qualityPercentage = 0;

            switch (quality){
                case "poor":
                    qualityPercentage = 0.05;
                    break;
                case "fair":
                    qualityPercentage = 0.10;
                    break;
                case "good":
                    qualityPercentage = 0.15;
                    break;
                case "great":
                    qualityPercentage = 0.20;
                    break;
                case "excellent":
                    qualityPercentage = 0.25;
                    break;
            }

            double totalTip = check * qualityPercentage;
            double totalPay = check + totalTip;
//            double totalPerPerson = totalPay/people;
//            double totalTipPerPerson = totalTip/people;

            System.out.println("Number of people entered: " + people);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip: " + totalTip);
//            System.out.println("Total per person: " + totalPerPerson);
//            System.out.println("Tip per person: " + totalTipPerPerson);

        }

//        System.out.println("Enter the number of people (number)");
//        int people = input.nextInt();
//
//        System.out.println("Enter the check amount (number)");
//        int check = input.nextInt();
//
//        System.out.println("Service Quality (String)");
//        String quality = input.next().toLowerCase();
//
//        input.close();
//
//        double qualityPercentage = 0;
//
//        switch (quality){
//            case "poor":
//                qualityPercentage = 0.05;
//                break;
//            case "fair":
//                qualityPercentage = 0.10;
//                break;
//            case "good":
//                qualityPercentage = 0.15;
//                break;
//            case "great":
//                qualityPercentage = 0.20;
//                break;
//            case "excellent":
//                qualityPercentage = 0.25;
//                break;
//        }
//
//        double totalTip = check * qualityPercentage;
//        double totalPay = check + totalTip;
//        double totalPerPerson = totalPay/people;
//        double totalTipPerPerson = totalTip/people;
//
//        System.out.println("Number of people entered: " + people);
//        System.out.println("Total to pay: " + totalPay);
//        System.out.println("Total tip: " + totalTip);
//        System.out.println("Total per person: " + totalPerPerson);
//        System.out.println("Tip per person: " + totalTipPerPerson);

         */

        Scanner input = new Scanner(System.in);

        System.out.println("split");
        String split = input.next().toLowerCase();

        System.out.println("people");
        int people = input.nextInt();

        System.out.println("check");
        double check = input.nextDouble();

        input.nextLine();

        System.out.println("quality");
        String quality = input.nextLine().toLowerCase();

        input.close();

        double qualityPercentage = (quality.equals("poor")) ? 0.05 : (quality.equals("fair")) ? 0.1 : (quality.equals("good")) ? 0.15 : (quality.equals("great")) ? 0.2 : (quality.equals("excellent")) ? 0.25 : 0;

        double totalTip = check * qualityPercentage;
        double totalToPay = check + totalTip;
        double totalPerPerson = totalToPay / people;
        double tipPerPerson = totalTip / people;

        System.out.println("people = " + people);
        System.out.println("totalToPay = " + totalToPay);
        System.out.println("totalTip = " + totalTip);

        if (split.equals("yes")) {
            System.out.println("totalPerPerson = " + totalPerPerson);
            System.out.println("tipPerPerson = " + tipPerPerson);
        }

    }
}

/*
 3. Create a class called TipCalculator, and write a program for a tip calculator.
	    There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)

	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:

		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75


 */