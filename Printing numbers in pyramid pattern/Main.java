import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = 0;
      for(int i = 1; i <= n; i++)
      {
        for(int j = 1; j <= n; j++)
        {
          if(j <= n-i)
          System.out.print(" ");
          else
          System.out.print(++k +" ");
        }
        System.out.print("\n"); 
        }    
    }
    } 