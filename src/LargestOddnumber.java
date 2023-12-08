public class LargestOddnumber {
    public static void main(String[] args) {
        String num = "5238";
        String result= largestOddNumber(num);
        System.out.println(result);
        System.out.println(num.length());
    }

    static String largestOddNumber(String num) {
        int i = num.length()-1;
        while(i>= 0){
            if (num.charAt(i) % 2 ==1){
                return num.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
}
