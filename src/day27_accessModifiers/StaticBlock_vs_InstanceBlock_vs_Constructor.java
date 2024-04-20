package day27_accessModifiers;

import java.util.Collections;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
        //const can take args
    }

    {
        System.out.println("Instance Block");
        // don't take any args. you need to pass known data
        // depends on obj
        // max no of exec: as many time as we want
    }

    static {
        System.out.println("Static Block");
        // don't take any args. you need to pass known data
        // it cannot get exec more than once. it doesnt depend on obj
        // one value shared by all obj of that class
        // max no of exec: 1
    }






    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor(); // once the obj is created inst block gets exec first, then the const.
        new StaticBlock_vs_InstanceBlock_vs_Constructor();






    }

}
