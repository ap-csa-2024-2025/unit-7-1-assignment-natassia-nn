import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    input = sc.nextLine();

    ArrayList<String> list = new ArrayList<String>();
    

    while (!input.equals("STOP"))
    {
      list.add(input);
    }
      System.out.println(list.size());
      System.out.println(list);
  }
}
