package JewelAd1.com;

public class Q4_Basic_1D_ArrayFundamental {
    public static void main(String[] args) {
        /** Print array Elements in Different Loops **/
//
//        int[] numbers=new int[5];
//        System.out.println("Array Length="+numbers.length);
//        for (int i = 0; i <numbers.length; i++) {
//            numbers[i]=i+100;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Element "+i+"="+numbers[i]);
//        }

        /** Advance for each loop **/

        int[] numbers=new int[5];
        System.out.println("Array Size="+numbers.length);
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=i+100;
        }
        for (int i:numbers) {
            System.out.println("Element="+i);
        }
    }
}
