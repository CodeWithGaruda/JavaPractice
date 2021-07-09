class AxisBank {
    static double intrest = 4.5;
    private String name;
    private int amount;
    private String aadhaString;

    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAadhaString() {
        return aadhaString;
    }

    public void setAadhaString(String aadhaString) {
        this.aadhaString = aadhaString;
    }

    public AxisBank(String name, int amount, String aadhaString, int time) {
        this.name = name;
        this.amount = amount;
        this.aadhaString = aadhaString;
        this.time = time;
    }

    @Override
    public String toString() {
        return "AxisBank [aadhaString=" + aadhaString + ", amount=" + amount + ", name=" + name + "]";
    }

    void account() {
        System.out.println("on your amount ur intrest costs:" + (this.amount * this.time * this.intrest) / 100);
    }

    void total() {
        System.out.println(this.amount + ((this.amount * this.time * this.intrest) / 100));
    }
}

class SbiBank {
    static double intrest = 5.5;
    private String name;
    private int amount;
    private String aadhaString;
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SbiBank [aadhaString=" + aadhaString + ", amount=" + amount + ", name=" + name + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAadhaString() {
        return aadhaString;
    }

    public SbiBank(String name, int amount, String aadhaString, int time) {
        this.name = name;
        this.amount = amount;
        this.aadhaString = aadhaString;
        this.time = time;
    }

    void total() {
        System.out.println(this.amount + ((this.amount * this.time * this.intrest) / 100));
    }
}

class ICICIBank {
    static double intrest = 6.0;
    private String name;
    private int amount;
    private String aadhaString;
    private int time;

    void total() {
        System.out.println(this.amount + ((this.amount * this.time * this.intrest) / 100));
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public ICICIBank(String name, int amount, String aadhaString, int time) {
        this.name = name;
        this.amount = amount;
        this.aadhaString = aadhaString;
        this.time = time;
    }

    @Override
    public String toString() {
        return "ICICIBank [aadhaString=" + aadhaString + ", amount=" + amount + ", name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAadhaString() {
        return aadhaString;
    }
}

public class Banks {
    public static void main(String[] args) {
        AxisBank krishnBank = new AxisBank("krishna", 100000, "asdjfjiji234", 10);
        krishnBank.account();
        SbiBank sanath = new SbiBank("sanath", 1203812, "skadfu3453", 5);
        sanath.total();
    }
}
