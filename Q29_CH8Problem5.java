package JewelAd1.com;
class TommyVercetti{
    public void hit()
    {
        System.out.println("Hitting the Enemy");
    }
    public void run()
    {
        System.out.println("Running from the Enemy");
    }
    public void fir()
    {
        System.out.println("Firing on the Enemy");
    }
}
public class Q29_CH8Problem5 {
    public static void main(String[] args) {
        TommyVercetti tomy=new TommyVercetti();
        tomy.hit();
        tomy.run();
        tomy.fir();
    }
}
