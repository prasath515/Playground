import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
      int res = Gtr(n1,n2);
      if(res>n3)
         System.out.println(res);
      else
   	     System.out.println(n3);
	}
  public static int Gtr(int n1,int n2)
  {
    int res;
   if(n1 > n2)
      res = n1;
    else
     res=n2;
     
  return res;
  }
}