import java.util.Scanner;
import java.util.ArrayList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int mode = 0;
    int modecount = 0;
    int numcount = 0;
    ArrayList<Integer> data = new ArrayList<>();
    for (int i = 0;i <= count;i++){
      in = new Scanner(System.in);
      int num = in.nextInt();
      data.add(num);
      for (int a = 0;a <= i;a++){
        numcount = 0;
        if (data.get(a) == num){
          numcount += 1;
        }
      }
      if (numcount > mode){
        mode = num;
        modecount = numcount;
      }
    }
    System.out.println(mode);
  }
}
