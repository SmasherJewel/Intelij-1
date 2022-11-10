package JewelAd1.com;
class Rectangle{
    int len,bre;
    public int area()
    {
        return len*bre;
    }
    public int perimeter()
    {
        return 2*(len+bre);
    }
}
public class Q28_CH8Problem4 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.len=4;
        rec.bre=6;
        System.out.println("Area="+rec.area());
        System.out.println("Perimeter="+rec.perimeter());
    }
}
