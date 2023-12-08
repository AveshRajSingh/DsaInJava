import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // This is selection sort

        int[]arr={5,4,3,2,1};
        selectionSort(arr);//calling the function
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, last);
           swap(arr,maxIndex,last);

        }
    }
     static int getMaxIndex(int[] arr, int end) {
       int max = 0;
        for (int i = 0; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
         }
        return max;
    }
    static void swap(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
