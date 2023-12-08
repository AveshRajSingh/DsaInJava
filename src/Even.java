public class Even {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);

    }
  static  int findNumbers(int[] nums) {
     int i =0;
     int count = 0;
     for (i = 0; i < nums.length ; i++){
         if(isEven(nums[i])){
             count++;
         }
     }
     return count;
    }
    static boolean isEven(int number){
        int count = 0;
        while ( number > 0){
            number = number / 10;
            count++;
        }
        if (count % 2 == 0 ) return true;
        else return false;

    }
}
