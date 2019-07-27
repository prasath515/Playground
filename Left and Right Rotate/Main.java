import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	for(int i = 0; i < n ; i++)
          {
            arr[i] = sc.nextInt();      
          }
        int rotation = sc.nextInt();
    Left_even(arr,rotation,n);
    Right_odd(arr,rotation,n);
    for(int i = 0;  i < n ; i++)
       { 
         System.out.print(arr[i]+" ");    
        }
  	}
  
    public static void Left_even(int arr[],int rotation,int n)
       {
          int first_elem = 1;
      	  int last_elem ;
      if(n % 2 == 0)
        last_elem = n-1;
      else 
        last_elem = n-2;
      for(int i=1; i <= rotation ; i++)
         {
            int temp = arr[first_elem];
            for(int j = 3; j < n ; j = j+2)
              { 
                  arr[j-2] = arr[j];             
              }
      		arr[last_elem] = temp;
         }
       }
  
  public static void Right_odd(int arr[],int rotation,int n)
       {
          int first_elem = 0;
    	  int last_elem ;
     	   if(n % 2 == 1)
  			  last_elem = n-1;
    	   else
              last_elem = n-2;
          for(int i = 1; i <= rotation; i++)
          {
            int temp = arr[last_elem];
            for(int j = (last_elem-2); j >= 0; j = j - 2)
               {
                 arr[j+2] = arr[j];
               }
             arr[first_elem] = temp;
          } 
       }
}