/**
 * 1)static variable 2)static blocks 3)static methods 4)non static variable
 * 5)non static blocks 6)non static methods
 */
class Alpha {
    Alpha() {
        super();
        System.out.println("here it will check for 1)static 2) non static blocks ");
        System.out.println("this is default constructor");
    }

    static int a, b, c;// static variable

    int x, y, z;// non static variable

    {
        x = 1;
        y = 2;
        z = 3;
        System.out.println("this is non static block");
    }// non static block

    static {
        a = 10;
        b = 20;
        c = 30;
        System.out.println("this is static block");
    }// static block

    static void disp1() {
        System.out.println(a + " " + b + " " + c);
    }// static method

    void disp2() {
        System.out.println(x + " " + y + " " + z);
    }// non static method
}

public class StaticKrishna {
    public static void main(String[] args) {
        /**
         * if u want to call static members u can directly access them by their class
         * name
         */
        System.out.println("this is before alpha object");
        Alpha alpha = new Alpha();
        // System.out.println(Alpha.a);
        System.out.println("this is after alpha object");
    }

}
