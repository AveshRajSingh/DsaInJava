public class  RemoveTheDuplicates  {
    public static void main(String[] args) {

        int num = 112211;
        int duplicate=num;
        int reversed = 0;
        while (num > 0) {

            int digit = num % 10;

reversed = reversed * 10 + digit;
num = num / 10;
}

if (reversed==duplicate)
    System.out.println("true");
}
}