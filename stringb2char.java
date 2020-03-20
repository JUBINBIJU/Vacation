import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Input the string: ");
        String str=ob.nextLine();
        System.out.println("Input the 2 chars:");
        char ch1=ob.next().charAt(0);
        char ch2=ob.next().charAt(0);
        System.out.println("characters between the input characters:");
        chara(str,ch1,ch2);
    }
 public static void chara(String str,char ch1,char ch2)
    {
        String str1=new String();
        String str2=new String();
        String str3=new String();
        int count = 0,count1=0;
        int k;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)==ch1)
            {
                count=i;
                break;
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch2)
            {
                count1=i;
                break;
            }
        }
        if(count!=0||count1!=0)
        {
            if(count>count1+1)
            {
              for(int i=count1+1;i<count;i++)
              str1=str1+str.charAt(i);
              k=(str1.length()/20)+1;
              for(int i=0;i<k;i++)
              {
                  System.out.println("\n");
                  str2="";
                  for(int j=0;j<20;j++)
                  {
                       str2=str2+(str1.charAt(i*20+j));
                       if(j==19)
                       {
                       str2=str2.replaceAll(""," ");
                       System.out.println(str2);
                       }
                       if((i*20)+j==str1.length()-1)
                       {
                           str2=str2.replaceAll(""," ");
                           System.out.println(str2);
                           break;
                       }
                  }
              }
            }
            else if(count+1<count1)
            {
                for(int i=count+1;i<count1;i++)
                str1=str1+str.charAt(i);
                k=(str1.length()/20)+1;
                for(int i=0;i<k;i++)
              {
                  System.out.println("\n");
                  str2="";
                  for(int j=0;j<20;j++)
                  {
                       str2=str2+(str1.charAt(i*20+j));
                       if(j==19)
                       {
                       str2=str2.replaceAll(""," ");
                       System.out.println(str2);
                       }
                       if((i*20)+j==str1.length()-1)
                       {
                           str2=str2.replaceAll(""," ");
                           System.out.println(str2);
                           break;
                       }
                  }
            }
            }
            else if((count==count1+1)||(count1==count+1))
            System.out.println("no enough characters to print");
            else
            System.out.println("not possible");
        }
        else
        System.out.println("not possible");
    }
}
