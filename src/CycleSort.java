import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
    int [] num1 = {1,2,3,0,0,0};
    int m = 3;
    int [] num2 = {2,5,6};
    int n = 3;
    merge(num1,m,num2,n);

    }
   static void merge(int[] nums1, int m, int[] nums2, int n) {
       int t = 0;
       for (int i = m; i < nums1.length; i++) {
           nums1[i] = nums2[t];
           t++;
       }
       for (int i = 0; i < nums1.length; i++) {
           for (int j = 1; j < nums1.length - i; j++) {
               if (nums1[j] < nums1[j - 1]) {
                   //swap
                   int temp = nums1[j];
                   nums1[j] = nums1[j - 1];
                   nums1[j - 1] = temp;
               }

           }

       }
       System.out.println(Arrays.toString(nums1));
   }
}