import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     // int temp = 1;
      for(int count = 1;count <= 2*n;count++)
      {
        if(count%2 == 1)
          { 
        	System.out.println(count);
        //  temp++;
          }    
      }
	     
	}
}