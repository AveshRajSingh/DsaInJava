import java.util.Arrays;

public class ConcecutiveZero {
    public static void main(String[] args) {
      int [] nums = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(nums)));
    }
    static int [] duplicateZeros(int[] arr){

        for (int i = 0; i < arr.length - 1 ; i++) {

            if (arr[i]==0){
                for (int j = arr.length - 2;  j >= i ; j--) {
                   arr[j+1] = arr[j];
                }

             i++;

            }
        }
        return arr;
    }
}
