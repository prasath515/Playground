import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int a=n/100,b=(n/10)%10,c=(n%10);
    int rev=(c*100)+(b*10)+(a);
    System.out.println(rev) ;
  }
}