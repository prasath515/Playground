import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       primeORnot(n); 
    }
  
  public static void primeORnot(int n)
  {
    int i,j,ch,count;
    for( i = 1; i <= n; i++)
    {
     ch = i ;
      count = 0;
      for(j = 1; j <= ch; j++)
      {
       if(ch%j == 0)
        {
         count++;
        }
      }
      if(count == 2)
        System.out.println(j-1);
    }
}
}