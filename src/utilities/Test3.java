package utilities;

import day31_inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier {
    // in order to access the ProtectedAccessModifier class' protected fields, Test3 needs to be a subclass of that class.

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.methodA();





























    }

}
