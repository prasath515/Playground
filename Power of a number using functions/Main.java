import java.util.Scanner;
class Main
{
	public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(), m = sc.nextInt();
      int res = power(n,m);
      System.out.print(res);    
    }

  public static int power(int n, int m)
  { int pow = 1;
    for(int i = 1; i<=m; i++)
    {
    pow = pow * n;
     }
    return pow;
    }
  
}