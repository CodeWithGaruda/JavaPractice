package Java8.oops;

class Point {
    private int x, y;

    // encapsulation
    /**
     * its a process in which the we prevent direct acces of data and establish
     * indirect access so to prevent we use private key word to establish indirect
     * access we use setters and getters we use constructor to directly assign the
     * values while creating the object if u want to mention the variables that are
     * particular to that class then we use this keyword
     */

    // this is constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int a) {
        x = a;
    }

    void setY(int b) {
        y = b;
    }

    int getY() {
        return y;
    }

    int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}

public class Encap1 {
    public static void main(String[] args) {
        /**
         * encapsulation: private setters and getters constructor this
         */
        Point p = new Point(3, 4);
        System.out.println(p);
    }
}
