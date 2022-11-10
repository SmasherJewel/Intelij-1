package JewelAd1.com;
import java.util.*;
public class Q1_SalaryAndRating {
    public static void main(String[] args) {
        /**  **/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary:");
        int salary=sc.nextInt();
        System.out.println("Enter the Performance appraisal rating:");
        double rating=sc.nextDouble();
         if (rating>=1.0 && rating<=3.0){
            int salary1=(salary/100)*10;
            int result1=(salary+salary1);
            System.out.println("Increment Salary="+result1);
        } else if (rating>=3.1 && rating<=4.0) {
            int salary2=(salary/100)*25;
            int result2=(salary+salary2);
            System.out.println("Increment Salary="+result2);
        } else if (rating>=4.1 && rating<=5.0) {
            int salary3=(salary/100)*30;
            int result3=(salary+salary3);
            System.out.println("Increment Salary="+result3);
        }
       else if (salary<=0 || rating>=5.1) {
            System.out.println("Invalid Input");
        }
    }
}
