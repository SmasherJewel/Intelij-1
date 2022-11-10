package JewelAd1.com;
class MyEmployee{
    String name;
    int id;
    public MyEmployee(String myName,int myId)// using constructor
    {
        name=myName;
        System.out.println("Name="+name);
        id=myId;
        System.out.println("Id="+id);
    }
    public MyEmployee()
    {
        name="Akash Kumar";
        System.out.println("My Name="+name);
         id=10;
        System.out.println("Id="+id);
    }
}
public class Q31_ConstructorHarry {
    public static void main(String[] args) {
        MyEmployee my = new MyEmployee("Jewel Uddin",11);
        MyEmployee mynew = new MyEmployee();
    }
}
