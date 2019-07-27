import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      while(count <= n)
        {
          if(n % count == 0)
            {
              System.out.println(count);
            }
      	  count++;
        }	    
	}
}