import java.util.Arrays;
public class SquareOfArray {
    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquare(nums)));
    }

    static int [] sortedSquare(int [] nums){
        for (int i = 0; i < nums.length; i++) {
          nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
