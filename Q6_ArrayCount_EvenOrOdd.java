package JewelAd1.com;
import java.util.*;
public class Q6_ArrayCount_EvenOrOdd {
    public static void main(String[] args) {
        /** WAJP to Count Even and Odd Numbers **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of an Array:");
        int n= sc.nextInt();
        int[] check=new int[n];
        int even=0;
        int odd=0;
        for (int i = 0; i < check.length; i++) {
            System.out.println("Enter Elements:");
            check[i] = sc.nextInt();
            if (check[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even Numbers="+even);
        System.out.println("Odd Numbers="+odd);
    }
}
