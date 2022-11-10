package JewelAd1.com;
class Ractangle{
    private int length;
    private int breadth;
    public Ractangle() {
        this.length=4;
        this.breadth=5;
    }
    public Ractangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
}
public class Q34_CH9Problem3 {
    public static void main(String[] args) {
        Ractangle rec = new Ractangle(8,9);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}
