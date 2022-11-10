package JewelAd1.com;
class Employee1{
    String name;
    int id;
    int salary;
    public void printMethod()
    {
        System.out.println("My Name is:"+name);
        System.out.println("and My Id is:"+id);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class Q24_CreatingOwnJavaClass {
    public static void main(String[] args) {
        // Instantiating a new Employee Object
        Employee1 aa=new Employee1();
        Employee1 raja=new Employee1();

        System.out.println("Creating My Own Java Class");

        // Setting Attributes for Farhad
        aa.name="Farhad";
        aa.id=52;
        aa.salary=12000;

        // Setting Attributes for Raza
        raja.name="Raza Sheik";
        raja.id=13;
        raja.salary=15000;

        // in this case we use Method for Printing for DRY Principle
        aa.printMethod();
        raja.printMethod();

        // Printing Salary
        int salary1= aa.getSalary();
        System.out.println(salary1);
        int salary2= raja.getSalary();
        System.out.println(salary2);

        // Printing the Attributes
//        System.out.println(aa.name);
//        System.out.println(aa.id);
    }
}
