package JewelAd1.com;
import java.util.*;
public class Q2_ArrayElementPrint {
    public static void main(String[] args) {
        /** WAJP to Create an Array and Print the Elements **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int n= sc.nextInt();
        int[] size=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter Elements:");
            size[i]= sc.nextInt();
        }
        for (int i=0;i<size.length;i++)
        {
            System.out.println(size[i]);
        }
    }
}
