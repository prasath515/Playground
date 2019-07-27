import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	 int sum;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     int b=n/100,c=n%10;
     sum=b+c;
      System.out.println(sum);
      
	}
}