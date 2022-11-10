package JewelAd1.com;
import java.util.*;
class AMethod{ //Base Class Override Problem Solve for use final void display then it can't use any derived class
                    // of this function name
    void display()
    {
        System.out.println("This is Base Class");
    }
}
class BMethod extends AMethod{ //Derived Class
    void display()
    {
        System.out.println("This is Derived Class");
    }
}
public class Q23_MethodOverriding {
    public static void main(String[] args) {
        BMethod aa=new BMethod();
        aa.display();
    }
}
