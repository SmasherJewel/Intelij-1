package JewelAd1.com;
import java.util.*;
class NewA{
    int a;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No:");
        a= sc.nextInt();
    }
}
class NewB extends NewA{
    int b;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No:");
        b= sc.nextInt();
    }
}
class NewC extends NewB{
    void add()
    {
        System.out.println("Addition="+(a+b));
    }
}
public class Q21_MultiLevel_Inheritance {
    public static void main(String[] args) {
        NewC aa=new NewC();
        aa.input();
        aa.getData();
        aa.add();
    }
}
