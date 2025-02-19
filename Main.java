import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    

    ArrayList<String> list = new ArrayList<String>();
    
    System.out.println("Please enter words, enter STOP to stop adding");
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      
      if (!input.equals("STOP"))
      {
        list.add(input);
      }

    }
     System.out.println(list.size());
     System.out.println(list);

     if (list.size() > 2)
     {
        String word = list.get(0);
        list.remove(word);
        list.set(list.size()-1, word);
        System.out.println(list);

     }
  }
}
