import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    int sum;
      while(n>100)
      {
        n = n/10;
      }
      sum = n % 10;
      System.out.println(sum);
	}
}