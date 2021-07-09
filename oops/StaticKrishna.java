/**
 * 1)static variable 2)static blocks 3)static methods 4)non static variable
 * 5)non static blocks 6)non static methods
 */
class Alpha {
    Alpha() {
        super();
        System.out.println("before it continue with this code it will check for static and non static");
        System.out.println("this is default constructor");
    }

    Alpha(int a) {
        this();// it will call this calss contructor
        System.out.println("this is parameterized");
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
        System.out.println("____________________________________________");
        Alpha a = new Alpha(1);
        // here when u call the object it goes to super again bt this time it wont call
        // the static block because static blocks are called only once thoughout the
        // program and non static blocks are called evrutime object is created.

        // we use static to use a single copy thoughout the program
        System.out.println("this is after alpha object");
    }

}
/**
 * this is before alpha object this is static block this is non static block
 * before it continue with this code it will check for static and non static
 * this is default constructor ____________________________________________ this
 * is non static block before it continue with this code it will check for
 * static and non static this is default constructor this is parameterized this
 * is after alpha object
 */