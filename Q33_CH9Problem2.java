package JewelAd1.com;
class Cylinder1{
    private int radius;
    private int height;

    public Cylinder1(int height,int radius){
       this.height=height;
       this.radius=radius;
        System.out.println("Height="+height);
        System.out.println("Radius="+radius);
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    public double surfaceArea()
    {
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}
public class Q33_CH9Problem2 {
    public static void main(String[] args) {
        Cylinder1 myCylinder = new Cylinder1(4,6);
        System.out.println("Area="+myCylinder.surfaceArea());
        System.out.println("Volume"+myCylinder.volume());
    }
}
