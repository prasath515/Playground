import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int res = sum(n);
     System.out.println(res);
    }
  
  public static int sum(int num)
  {
    int count =0;
     for(int i = 1; i<=num; i++)
     {
        count = count + i;
      }
  return count;
  }
  
}