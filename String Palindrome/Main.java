import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    { 
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int len = str.length();
      int front  = 0;
      int end = len - 1;
      boolean match = true;
      while(front < end)
      {
         if(str.charAt(front) != str.charAt(end))
            {
               match = false;
               break;
            }  
        front++;
        end--;
      }
      if(match == true)
        System.out.print("Yes");
      else
        System.out.print("No");        
    } 
}