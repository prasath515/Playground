import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int stat[] = new int[26];
     for(int idx = 0; idx < len; idx++)
     {
         char ch = str.charAt(idx);
         if(ch >= 'a' && ch <= 'z')
         {
            int offset = ch - 'a';
            stat[offset]++;
         } 
         else if(ch >= 'A' && ch <= 'Z' )
         {
            int offset = ch - 'A';
            stat[offset]++;         
         }
     }
        for(int j = 0; j < len; j++)
        { 
           char ch = str.charAt(j);             
          if(ch >='A' && ch<='Z')
           {            
              ch =(char) (ch+32);
           }
            int offset = ch - 'a';
            if(stat[offset] != 0)
            {
             frequency(ch,stat);
            }          
         }
        
    }  
  public static void frequency(char ch,int stat[])  
  {
      if(ch >= 'a' && ch <= 'z')
          {
                int offset = ch - 'a';
               System.out.print(ch +""+ stat[offset]+" ");  
               stat[offset] = 0;
          }
          else if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char) (ch + 32);
               int offset = ch - 'a';
            	System.out.print(ch +""+ stat[offset]+" ");  
              stat[offset] = 0;
            }
  }

}