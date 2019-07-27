import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
     String str = sc.nextLine();
     int len = str.length();
     int temp = 1;
     double sum_bf = 0;
     double sum_af = 0;
     double offset ;
    for(int i= 0; i < len ;i++)
       {
          if(str.charAt(i) == '.')
     			temp = 0;
       }
      
      if(temp == 0)  
       {
         for(int i = 0;  str.charAt(i)  != '.' && i < len  ; i++)
              {
                 char ch = str.charAt(i);
                 offset = ch - '0';
                 sum_bf = sum_bf*10 + offset;       
              }
        for(int i = len-1; str.charAt(i) != '.' && i >= 0 ; i--)
             {
                 char ch = str.charAt(i);
                 offset = ch - '0';
                 sum_af = sum_af/10 + offset;       
             }
               sum_af = sum_af/10;      
        }
       else
          { 
             for(int i = 0; i < len  ; i++)
               {
                  char ch = str.charAt(i);
                  offset = ch - '0';
                  sum_bf = sum_bf*10 + offset;       
               }     
         }

          double  sum = sum_af + sum_bf; 
          System.out.printf("%.6f",sum);
   }
}