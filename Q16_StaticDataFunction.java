package JewelAd1.com;

public class Q16_StaticDataFunction {
    String name;
    int roll;
    static String cName="Techno India College of Technology";
    void student(String x,int y)
    {
        name=x;
        roll=y;
    }
    void display()
    {
        System.out.println("\nName:"+name+"\nRoll No:"+roll+"\nCollege Name:"+cName);
    }
    static void change()// static is mandatory for this function
    {
        cName="TINT";// not part of object
    }

    public static void main(String[] args) {
        Q16_StaticDataFunction aa=new Q16_StaticDataFunction();
        Q16_StaticDataFunction bb=new Q16_StaticDataFunction();
        aa.student("Farhad Mulla",52);
        bb.student("Raja Sheik",13);
        aa.display();
        bb.display();
        Q16_StaticDataFunction.change();// we call static function (ClassName.FunctionName)
        aa.display();
        bb.display();

    }
}
