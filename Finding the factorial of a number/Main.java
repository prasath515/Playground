import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(fact(n));
  }
  public static int fact(int n)
  {
    if(n != 0)
    {
      return n*fact(n-1);    
    }
    return 1;
  }
}