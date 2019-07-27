import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int stat[] = new int[26];
      int len = str.length();
      for(int i=0; i < len ;i++)
        {
           char ch = str.charAt(i);
           if(ch >= 'a' && ch <= 'z')
            {
              int offset = ch - 'a';
              stat[offset]++;        
             }
        else if(ch >= 'A' && ch <= 'Z')
            {
              int offset = ch - 'A';       
              stat[offset]++;
            }
        }
      for(int j=0 ; j < stat.length ; j++)
        {
           if(stat[j] == 0)
           {
 			  char ch = (char) ('a' + j);	
              System.out.print(ch+" ");      
           }
       }
    }
}