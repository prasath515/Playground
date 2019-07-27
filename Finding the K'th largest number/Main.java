import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt(); 
      }
      int sec_max = sc.nextInt();
      ascending(arr,n);
      for(int i = 0; i < n; i++)
         { 
            if( i == sec_max )
              System.out.print(arr[n-i]);
         }
      
      
    }   
  
  
  public static void ascending(int arr[], int n)
     {
        for(int i = 0; i < n ; i++)
           { 
               int  j = i+1;
               while(j < n)
                 {  
                   if(arr[i] > arr[j])
                     {
                       int temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                     }
                  j++;
                 }
           }  
    
     }
}