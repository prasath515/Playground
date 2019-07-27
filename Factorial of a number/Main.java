import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1, fact = 1;
      while(count <= n)
        {
     	      fact = fact * count;
        count++;
        } 
      System.out.println(fact);
       
	}
}