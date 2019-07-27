import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i < n ; i++)
      arr[i] = sc.nextInt();
    int count;
    int idx = 0,max = 0;
    for( int i = 0; i < n; i++)
       { 
         count = 0;
         for(int j=0; j < n; j++)
         {
           if(arr[i] == arr[j] && (i!=j) )
             {
               count++;
               idx = i;
             }
         }
       if(count > max)
           max = count; 
       }
    System.out.print(arr[idx]);
  }
}