package day25_constructors;

public class TestRectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3,4); // i only have 1 c. atm. we made it mandatory for user to set l and w everytime when user creates obj from rec class
        // the moment that this obj gets cfreated the c gets exec.
        // so the first arg length will be assigned to length instance var.
        // second = width
        // so i dont need to call addit actions to set l and w
        // cuz this c will exec auto and takes care of setting l and w

        Rectangle rectangle2 = new Rectangle(4,5);
        // the c will be exec one more time for this obj as well

        Rectangle rectangle3 = new Rectangle(5,6);

        Rectangle rectangle4 = new Rectangle(7,8);

        Rectangle rectangle5 = new Rectangle(10,12);

        /*Rectangle rectangle1 = new Rectangle(); // this is the only const we have, default const. if this wasn't here then you wouldn't be able to create the obj. cuz every single obj must be created with the const.
        // you have this method gets exec when create the obj we also have this method in the rec class
        // body is empty
        // in this case setInfo method is unnecessary
        // if you apply constructor in the rec class and const body to take care of the the code frag. then we don't need setInfo. The moment obj created all the instances will be set. that's the adv. of const.
*/


        //System.out.println(rectangle1);
        // initially we only have 0s because above const can't decide by itself. instead we created the setInfo method.

        /*rectangle1.setInfo(3,4);

        Rectangle rectangle2 = new Rectangle();
        // you create the c here but just for creating the obj, you still need to create setinfo method to set the l and w
        // this c is still a method in the rec class
        // if this is a method, instead of creating another method to setting the inst of obj it's smarter to let this method to take care of setting these instances.
        // cuz when obj is created c gets exec anyway so it can also set l and w at the same time
        // starting from now you will say goodbye to the setInfo method forever :) instead you will be using constructors
        // otherwise you have to call it yourself for every obj in order to set them
        // with c it's easier to set the instance. you dont need any external actions

        // every single IDE has shortcut to generate const. once you create the inst vars that allows you to set the inst the moment the obj is created

        rectangle2.setInfo(4,5);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(5,6);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(6,7);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(7,8);*/


//        System.out.println(rectangle1.toString());
//        System.out.println(rectangle1.area());


        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);
    }
}
