package JewelAd1.com;

public class Q15_StaticDataMember {
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

    public static void main(String[] args) {
        Q15_StaticDataMember aa=new Q15_StaticDataMember();
        Q15_StaticDataMember bb=new Q15_StaticDataMember();
        aa.student("Jewel Uddin",11);
        bb.student("Dikshit Raj",06);
        aa.display();
        bb.display();

    }
}
