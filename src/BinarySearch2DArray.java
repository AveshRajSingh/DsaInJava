import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {16,28,37,50},
                {33,34,43,53}
        };
        int target = 35;
        System.out.println(Arrays.toString(search(matrix,target)));


    }
    static int[]search(int [][]matrix, int target){
        int row = 0;
        int colum = matrix.length-1;
        while (row < matrix.length && colum >= 0) {
            if (matrix[row][colum] == target) {
                return new int[]{row,colum};
            }

            if (matrix[row][colum] > target) {
                colum--;
            }
            else {
                row++;
            }

        }
        return new int[]{-1,-1};
    }
}
