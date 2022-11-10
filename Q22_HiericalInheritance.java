package JewelAd1.com;
import java.util.*;
class  HieA{
    int a,b;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No:");
        a= sc.nextInt();
        System.out.println("Enter 2nd No:");
        b= sc.nextInt();
    }
}
class HieAdd extends HieA{
    void add()
    {
        System.out.println("Addition="+(a+b));
    }
}
class HieSub extends HieA{
    void sub()
    {
        System.out.println("Subtraction="+(a-b));
    }
}
public class Q22_HiericalInheritance {
    public static void main(String[] args) {
        HieAdd aa=new HieAdd();
        HieSub bb=new HieSub();
        aa.getData();
        aa.add();
        bb.getData();
        bb.sub();
    }
}
