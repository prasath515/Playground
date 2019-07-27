import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int len = str.length();
        int front = 0;
        int end = len - 1;
        reverse_string(sb,front,end);
       int start_indx = 0;
      for(int i = 0; i < len; i++)
        {
          if(sb.charAt(i) == ' ')
            {
               reverse_string(sb, start_indx, i-1);
               start_indx = i+1;
            }
       /* else if(i == end)
        {
          reverse_string(sb, start_indx, i);
          start_indx = i+1;
         }*/
        }
     System.out.print(sb);
    }
    
    public static void reverse_string(StringBuilder sb, int front, int end)
    {
      while(front < end)
       {
         char ch = sb.charAt(front);
         sb.setCharAt(front,sb.charAt(end));
         sb.setCharAt(end,ch);
         front++;
         end--;
      }  
      
    }
}