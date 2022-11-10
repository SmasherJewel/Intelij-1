package JewelAd1.com;

public class Q14_MethodOverloading {

//    static void tellJoke()
//    {
//        System.out.println("I invented a new word!\n"+"Hello");
//    }
//
//    public static void main(String[] args) {
//        tellJoke();
//    }

    /** Changing the Integer **/

//    static void change(int x){
//        x=98;
//    }
//
//    public static void main(String[] args) {
//        int a=67;
//        change(a);// value of a should not change to calling change function because a value should be copied on x
//        System.out.println("The value of x after running change is:"+a);// in this case we change in calling method
//                                                                        //value can't be change
//    }

    /** Changing the Array **/

//    static void change2(int[] arr)// reference should be copied on this argument
//    {
//        arr[0]=90;
//    }
//    public static void main(String[] args) {
//        int[] marks={45,67,98,85,89};// marks is a reference it stored address
//        change2(marks);
//        System.out.println("The value os mark after running change is:"+marks[0]);
//    }

    /** Method Overloading **/

    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" bro!");
    }
    static void foo(int a,int b){// called parameter (when they have no value)
        System.out.println("Good Morning "+a+" bro!");
        System.out.println("Good Morning "+b+" bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(40);
        foo(300,400);// called argument (when they got value)
    }
}
