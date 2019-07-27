import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
          int res=0,sum=1;
	for(int i=1; i<=expo;i++)	
    {
      sum=sum*base;
    }
      System.out.print(sum);
    }
}