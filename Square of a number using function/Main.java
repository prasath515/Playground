import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
   int val = n*n;
    return(val);
  }
  
	public static void main (String[] args)
    {
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int res = square(n);
      System.out.println(res);
	} 
}