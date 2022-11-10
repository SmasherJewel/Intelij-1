package JewelAd1.com;

public class Q5_Basic_MultiDimensional_ArrayFundamental {
    public static void main(String[] args) {
        /** Print Numbers in Two Dimensional Array **/

//        int row=2;
//        int colum=3;
//        int[][] twoDArray=new int[row][colum];
//        int value=0;
//        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
//            for (int columIndex = 0; columIndex < colum; columIndex++) {
//               twoDArray[rowIndex][columIndex]=value++;
//
//            }
//        }
//        for (int rowIndex = 0; rowIndex < twoDArray.length; rowIndex++) {
//            for (int columIndex = 0; columIndex < twoDArray[rowIndex].length; columIndex++) {
//                System.out.println("My Two Dimensional Array ["+rowIndex+"]"+"["+columIndex+"]"+":"+twoDArray[rowIndex][columIndex]);
//
//            }
//        }

        /** Example 2 **/

//        int[][] twoDArr={{0,1,2},{3,4,5}};
//        for (int rowIndex = 0; rowIndex < twoDArr.length; rowIndex++) {
//            for (int columIndex = 0; columIndex < twoDArr[rowIndex].length; columIndex++) {
//                System.out.println("Elements ["+rowIndex+"]"+"["+columIndex+"]"+"="+twoDArr[rowIndex][columIndex]);
//
//            }
//        }

        /** Advance for each loop **/

        int[][] twoDAr={{0,1,2},{3,4,5}};
        for (int[] i:twoDAr) {
            for (int j:i) {
                System.out.println("Element="+j);
            }

        }

        /** Two Dimensional Array Example: Population Ratio of Asia
         Across The Years 2019,2020,2021 **/
    }
}
