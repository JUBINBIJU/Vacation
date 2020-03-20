  import java.util.Scanner;
public class HelloWorld
{
  public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Input the string: ");
        String str=ob.nextLine();
        System.out.println("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
