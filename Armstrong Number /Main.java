import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(),rem,sum = 0;
      int temp = n;
      while(n>0)
        {
          rem = n%10;
          sum = sum + (rem*rem*rem);
          n = n/10;       
        } 
      if(sum == temp)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}