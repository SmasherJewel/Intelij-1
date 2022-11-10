package JewelAd1.com;
class CellPhone{
    public void ring()
    {
        System.out.println("Ringing....");
    }
    public void vibrate()
    {
        System.out.println("Vibrating....");
    }
    public void callFriend()
    {
        System.out.println("Call Raza....");
    }
}
public class Q26_CH8Problem2 {
    public static void main(String[] args) {
        CellPhone cell=new CellPhone();
        cell.ring();
        cell.vibrate();
        cell.callFriend();
    }
}
