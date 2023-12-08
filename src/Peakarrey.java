public class Peakarrey {
    public static void main(String[] args) {
        int[]arr ={1,2,4,6,8,7,5,4,3,};
        int target = arr[0];
        int ans = findPeakArray(arr, target);
        System.out.println(ans);

    }
    static int findPeakArray (int[]arr,int target){


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>target){

                target = arr[i];
            }
        }
        return target;
    }
}
