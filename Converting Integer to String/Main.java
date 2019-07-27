import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     StringBuilder sb = new StringBuilder("");
    int rem = 0;
    int temp = n;
     if(n < 0)
        n = n  * (-1);
     while(n > 0)
     { 
        rem = n % 10;
          n = n / 10;
       char ch = (char) (rem + '0');
        sb.append(ch);
     }

    int len = sb.length();

    StringBuilder val = new StringBuilder("");

    for(int i = len-1; i >= 0; i--)
        {
           val.append(sb.charAt(i));
        }
    for(int i = 0; i < val.length(); i++)
      {
         if(temp < 0)
           {
             if(i == 0)
               System.out.print("-"+val.charAt(i));
             else
               System.out.print(val.charAt(i));                                         
          } 
        else
           System.out.print(val.charAt(i));
      }                            
  }
}
