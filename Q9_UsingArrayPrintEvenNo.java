package JewelAd1.com;
import java.util.Scanner;
public class Q9_UsingArrayPrintEvenNo {
    public static void main(String[] args) {
        /** WAJP using array Print only Even Numbers **/

        // Hard Coded
//        int[] even={2,4,5,8,9,10};
//        for (int i = 0; i < even.length; i++) {
//            if (even[i]%2==0){
//                System.out.println("Even Numbers in this Array="+even[i]);
//            }
//        }

        // Soft Coded

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int n= sc.nextInt();
        int[] even=new int[n];
        int numbers=0;
        for (int i=0;i<n;i++){
            System.out.println("Enter Elements:");
            even[i]= sc.nextInt();
        }
        for (int i = 0; i < even.length; i++) {
           if (even[i]%2==0){
               numbers=even[i];
           }
        }
        System.out.println("Even Numbers in this Array="+numbers);
    }
}
