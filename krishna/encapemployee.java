package krishna;
class employee{
    private int empid;
    private String name;
    private String city;
    private double salary;
    employee(int empid,String name,String city,double salary){ //constructor
        this.empid = empid;
        this.name=name;
        this.city=city;
        this.salary=salary;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "employee [city=" + city + ", empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
    }
}
public class encapemployee {
    public static void main(String[] args) {
        employee Krishna=new employee(1624039,"Krishna","Hyderabad",700000.0);
        System.out.println(Krishna);
        employee Sanath = new employee(111,"Sanath","Khammam",700000);
        System.out.println(Sanath);
        Sanath.setCity("Goa");
        System.out.println(Sanath.getCity());
        System.out.println(Sanath);
    }
}
