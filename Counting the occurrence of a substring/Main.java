import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    int len1 = str1.length();
    int len2 = str2.length();
    int count = 0;
    for(int i = 0; i < (len1 - len2 + 1 ); i++)
       { 
         boolean matching = true;
           for(int j = 0; j < len2 ; j++)
            {  
             if(str1.charAt(i+j) != str2.charAt(j))
              {
                matching = false;
              }
            }
         if(matching == true)
           count++;
       }
    System.out.print(count);
  } 
}