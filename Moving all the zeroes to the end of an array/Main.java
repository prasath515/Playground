import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
       Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	for(int i = 0; i < n ; i++)
          {
            arr[i] = sc.nextInt();      
          }
      Moving(arr,n);
       for(int i = 0;  i < n ; i++)
       { 
         System.out.print(arr[i]+" ");    
        }
    }
    
    public static void Moving(int arr[], int n)
       {
           int count = 0;
       for(int indx = 0; indx < n ; indx++)
           {
               if(arr[indx] != 0 )
              {              
                 int temp = arr[indx];
                 arr[indx] = arr[count];
                 arr[count] = temp;
                 count++;  
      	      }
           }
    }  
}