package JewelAd1.com;

class Employee{
    String name;
    int salary;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
public class Q25_PraticeSet_8 {
    public static void main(String[] args) {

        Employee jewel=new Employee();

        jewel.setName("Jewel Uddin");
        jewel.salary=3000;

        System.out.println(jewel.getName());
        System.out.println(jewel.getSalary());
    }
}
