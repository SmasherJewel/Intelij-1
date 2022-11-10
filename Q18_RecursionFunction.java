package JewelAd1.com;

public class Q18_RecursionFunction {

//    static int factorial(int n){
//        if (n == 0 || n==1) {
//            return 1;
//        }
//        else {
//            return n * factorial(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        int x=5;
//        System.out.println("The value of factorial x is: "+factorial(x));
//    }

    /** Factorial Iterative **/

    static int factorial_Iterative(int n){
        if (n == 0 || n== 1) {
            return 1;
        }
        else {
            int pro=1;
            for (int i = 1; i <= n; i++) {
                pro *=i;
            }
            return pro;
        }
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("The value of factorial x is:"+factorial_Iterative(x));
    }
}
