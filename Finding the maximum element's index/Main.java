import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i < n ; i++ )
    {
      arr[i] = sc.nextInt();
    }
    max(arr,n);
  }
  
  public static void max(int arr[],int n)
  { int indx = 0,max = 0;
   for(int i=0; i<n ;i++)
   { 
    if(arr[i] > max)
    {
       max = arr[i];
       indx = i;  
    }
   }
  System.out.print(indx);
  }
}