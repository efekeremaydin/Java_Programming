package day32_finalKeyword.carTask_methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void setModel(String model) {
//        if (!model.equals("Model S") || !model.equals("Model Y") || !model.equals("Model X") || !model.equals("Model 3")) {
//            System.err.println("Invalid");
//            System.exit(1);
//        }
//        super.setModel(model);

        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model x", "Model 3" ));
       // String[] models = {"Model S", "Model Y", "Model x", "Model 3" };
        if (!models.contains(model)) {
            System.err.println("Invalid Tesla Model: " +model);
            System.exit(1);
        }
        super.setModel(model); // this.model = model;
    }

    @Override
    public void setColor(String color) {

//        if (!color.equals("White") || !color.equals("Red") || !color.equals("Black") || !color.equals("Silver") || !color.equals("Blue") || !color.equals("Brown") || !color.equals("Green")) {
//            System.err.println("Invalid");
//            System.exit(1);
//        }
//        super.setColor(color);

            ArrayList<String> colors = new ArrayList<>();
            colors.addAll(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange", "White"));
            //String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange", "White"};

            if (!colors.contains(color)){
                System.err.println("Invalid Tesla color " + color);
                System.exit(1);
            }
            super.setColor(color); // this.color = color;
    }

    @Override
    public void setYear(int year) {
        if (year < 2008){
            System.err.println("Invalid year of Tesla car " + year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if (price < 50000){
            System.err.println("Invalid price for Tesla car " + price);
            System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }

    public void autoPilot() {
        System.out.println(getMake()+ " "+ getModel() + " " + "is in self-driving mode");
    }
}

