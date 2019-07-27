import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n ; i++)
      {
        arr[i] = sc.nextInt();
      }
      int value = sc.nextInt();
      perfect_couple(arr,n,value);
    }
  
  public static void perfect_couple(int arr[],int n,int value)
  {
    for(int i = 0; i < n ;i++ )
    {
      for(int j = i+1; j < n; j++)
      {
        if( ( arr[i] + arr[j] ) == value)
        {
          System.out.println(arr[i]+", "+arr[j]);
        }
      
      }  
    }
  } 
}