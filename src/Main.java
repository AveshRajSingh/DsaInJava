public class Main {
public static void main(String[] args)
 {
    int [] numbs = {1,1,0,1,1,1};
    int result = find(numbs);
    System.out.println(result);
  }
   public static int find(int [] numbs){
    if (numbs.length==0)return 0;
    int count =0, max = 0;
       for (int numb : numbs) {
           if (numb == 1) {
               count++;
               max = Math.max(max, count);
           } else count = 0;
       }
       return max;
    }
}
