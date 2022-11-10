package JewelAd1.com;
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // Math.PI for Accuracy
    public double surfaceArea(){
        // return 2*3.14*radius*radius + 2*3.14*radius*height;
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        //return 3.14*radius*radius*height;
        return Math.PI*radius*radius*height;
    }
}
public class Q32_CH9Problem1 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(6);
        System.out.println("Radius="+myCylinder.getRadius());
        myCylinder.setHeight(4);
        System.out.println("Height="+myCylinder.getHeight());

        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
}
