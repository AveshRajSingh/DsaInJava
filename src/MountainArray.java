public class MountainArray {
    public static void main(String[] args) {
        int []arr = {0,6,7,8,5,4,3,2};
        boolean result = validMountainArray(arr);
        System.out.println(result);

    }
    static boolean validMountainArray(int [] arr){
        int A = arr.length , i = 0, j = A -1;

        while(arr[i]<arr[i+1]&& i+1<A){
            i++;
        }
        while(j > 0 && arr[j-1]>arr[j]){
            j--;
        }


        return ( i > 0 && j < A - 1 && i == j);
    }
}
