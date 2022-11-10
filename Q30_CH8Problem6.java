package JewelAd1.com;
class Circle{
    float pi=3.14f,r;
    public float area()
    {
        return pi*r*r;
    }
    public float perimeter()
    {
        return 2*pi*r;
    }
}
public class Q30_CH8Problem6 {
    public static void main(String[] args) {
        Circle cer=new Circle();
        cer.r=4;
        System.out.println("Area="+cer.area());
        System.out.println("Perimeter="+cer.perimeter());
    }
}
