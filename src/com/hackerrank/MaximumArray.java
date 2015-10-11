package com.hackerrank;

public class MaximumArray {
	

   public static void maxSumSubArray(int[] a) {

        int maxSumFound = a[0];
        int tempMaxSumFound = a[0];
        int tempStartIndex = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 1; i < a.length; i++) {

                   if (a[i] < tempMaxSumFound + a[i]) {
                            tempMaxSumFound = tempMaxSumFound + a[i];
                   } else {
                            tempMaxSumFound = a[i];
                            tempStartIndex = i;
                   }

                   if (maxSumFound < tempMaxSumFound) {
                            maxSumFound = tempMaxSumFound;
                            startIndex = tempStartIndex;
                            endIndex = i;
                   }
        }

   System.out.println("Maximum Contingous sum found is: " + maxSumFound);
   System.out.println("has startIndex: " + startIndex);
   System.out.println("has endIndex: " + endIndex);
  }
   
   public static void main(String[] args) {

       int[] a = { -1, -2, -3, -2};
      maxSumSubArray(a);
}

}
