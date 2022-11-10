package JewelAd1.com;
import java.util.*;
class A     // Base Class
{
    int a,b;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No:");
        a=sc.nextInt();
        System.out.println("Enter 2nd No:");
        b= sc.nextInt();
    }
    void display()
    {
        System.out.println("Addition="+(a+b));
    }
}
class B extends A // Derived Class (Class A properties can use Class B)
{
    int c;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3rd No:");
        c= sc.nextInt();
    }
    void add()
    {
        System.out.println("Addition="+(a+b+c));
    }
}
public class Q20_Single_Inheritance {
    public static void main(String[] args) {
        B aa=new B();
        aa.input();
        aa.getData();
        aa.add();
        aa.display();
    }
}
