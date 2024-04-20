package day27_accessModifiers;

public class InstanceBlock {

    // instance block aka inst init block cuz in the inst block you can init inst var
    // whatever code frag you have will get exec when you create the obj
    {
        System.out.println("Instance block");
    }
    // if you create 1 obj, inst b will get exec once, and if you create 2 obj, it will get exec twice etc
    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new InstanceBlock(); // const exec always depend on the obj
        // but const is not the only thing that gets exec when the obj is created
        // there's a block, exec of that block depends on the obj: instance block
        // when you create obj inst b will get exec first and then const. inst b runs before the const.

        new InstanceBlock();
        new InstanceBlock();













    }













}
