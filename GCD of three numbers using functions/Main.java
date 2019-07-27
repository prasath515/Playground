import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{ 
	 Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
      int res = Gcd1(n1,n2);
      int min = 0;
      if(res>n3)
        min=n3;
      else
        min=res;
      while(min >= 1 )
         {
          res = min;
        break;
         }
	   System.out.println(res);
	}
  public static int Gcd1(int n1,int n2)
  {
    int min,gcd = 0;
    if(n1>n2)
      min = n2;
    else
      min = n1;
    while(min >= 1)
    {
    if(n1 % min == 0 && n2 % min == 0 )
    {
     gcd = min;
      break;    
    }
    }
 return gcd;  
  }
}