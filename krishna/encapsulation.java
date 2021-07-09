package krishna;
class point{
    private int x,y;
    // encapsulation
    /**
     * its a process in which we prevent direct acces of data and establish indirect access
     * so to prevent we use private key word to establish indirect access
     * we use setters and getters we use constructor to directly assign the values
     * while creating the object if u want to mention the variables that are particular to that class then we use this keyword
     */

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    // this is constructor
    point(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
public class encapsulation {
    public static void main(String[] args) {
        /**
         * encapsulation: private, setters and getters, constructor, this
         */
        point p = new point(3,4);
        System.out.println(p);
        p.setX(5);
        p.setY(6);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p);
    }
}