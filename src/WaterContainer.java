public class WaterContainer {
    public static void main(String[] args) {
        int [] arr ={1,8,6,2,5,4,8,3,7};
      int max=  container(arr);
        System.out.println(max);
    }
    static int container(int [] arr){
        int left = 0;
        int right = arr.length - 1 ;
        int maxArea  = 0;
        while (left < right){
            int width = right - left;
            int area = width* Math.min(arr[left],arr[right] );
            maxArea = Math.max(area,maxArea);
            if (arr[left]> arr[right]){
                right--;
            } else if (arr[right]>arr[left]) {
                left++;

            }else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}
