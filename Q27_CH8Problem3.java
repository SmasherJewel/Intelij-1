package JewelAd1.com;
class Square{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class Q27_CH8Problem3 {
    public static void main(String[] args) {
        Square sq=new Square();
        sq.side=3;
        System.out.println("Area="+sq.area());
        System.out.println("Perimeter="+sq.perimeter());
    }
}
