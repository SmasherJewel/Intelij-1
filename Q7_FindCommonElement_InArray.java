package JewelAd1.com;

public class Q7_FindCommonElement_InArray {
    public static void main(String[] args) {
        /** WAJP an Array to Find Common Value of two arrays **/

        int[] n1={1,3,4,6,8};
        int[] n2={1,4,6,10,8};
//        int el=0;
        for (int i = 0; i < n1.length; i++) {
            int el=n1[i];
            for (int j = 0; j < n2.length; j++) {
                if (el==n2[j]){
                    System.out.println("Common Elements="+el);
                }
            }
        }
    }
}
