package day32_finalKeyword.carTask_overriding;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void setModel(String model) {
        if (!model.equals("Model S") || !model.equals("Model Y") || !model.equals("Model X") || !model.equals("Model 3")) {
            System.err.println("Invalid");
            System.exit(1);
        }
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        if (!color.equals("White") || !color.equals("Red") || !color.equals("Black") || !color.equals("Silver") || !color.equals("Blue") || !color.equals("Brown") || !color.equals("Green")) {
            System.err.println("Invalid");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if (year < 2008){
            System.err.println("Invalid");
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(int price) {
        if (price < 50000){
            System.err.println("Invalid");
            System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\"");
    }

    public void autoPilot() {
        System.out.println("Started AutoPilot");
    }
}

