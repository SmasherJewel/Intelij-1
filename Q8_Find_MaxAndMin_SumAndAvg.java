package JewelAd1.com;

public class Q8_Find_MaxAndMin_SumAndAvg {
    public static void main(String[] args) {
        /** WAJP to find maximum Element **/

        int[] no={20,30,60,70,80};
        int max=no[0];
        for (int i = 0; i < no.length; i++) {
            if (no[i]>max){
                max=no[i];
            }
        }
        System.out.println("Maximum Number in this Array="+max);

        /** WAJP to find minimum Element **/

        int[] no1={20,30,60,70,80};
        int min=no[0];
        for (int i = 0; i < no.length; i++) {
            if (no1[i]<min){
                min=no1[i];
            }
        }
        System.out.println("Maximum Number in this Array="+min);

        /** WAJP to find sum of an array **/

        int[] no2={5,6,8,9,10};
        int sum=0;
        for (int i = 0; i < no2.length; i++) {
            sum +=no2[i];
        }
        System.out.println("Sum of an Array="+sum);

        /** WAJP to find the Average of an Array **/

        int[] no3={6,8,9,10,15};
        float avg=5.0f;
        int result=0;
        for (int i = 0; i < no3.length; i++) {
            result +=no3[i];
        }
        System.out.println("Sum of an Array="+result/avg);
    }
}
