import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
      for(int i=0; i < n; i++)
        {
           arr[i] =sc.nextInt();
        }
      int count, max = 0;
      for(int  i = 0; i < n; i++)
        { 
          count = 0;
         while(i < n)
         {
            if(arr[i] == 1)
             {
               count++;
               i++;
             }
            else
               break;
         }
        if(count > max)
           max = count; 
        }
      System.out.print(max);
    }
}