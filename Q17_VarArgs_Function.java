package JewelAd1.com;

public class Q17_VarArgs_Function {

//    static int sum(int ...arr){
//        // Available as an int[] arr (array type)
//        int result=0;
//        for (int a: arr){
//            result +=a;
//        }
//        return  result;
//    }
//    public static void main(String[] args) {
//        System.out.println("Sum of 2 and 4: "+sum(2,4));
//        System.out.println("Sum of 4 and 8: "+sum(4,8));
//        System.out.println("Sum of 45 and 78: "+sum(45,78));
//    }

    // Compulsory Argument also you can pass

   static int sum(int a,int ...arr){// int a is a mandatory argument
       int result=a;
       for (int element: arr) {
           result +=element;
       }
       return  result;
   }
    public static void main(String[] args) {
        System.out.println("Sum of 6 and 7: "+sum(6));
        System.out.println("Sum of 7 and 9: "+sum(7,9));
//        System.out.println("Nothing pass it should be an error: "+sum());// not null int arr
    }
}
