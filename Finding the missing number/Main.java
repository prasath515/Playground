import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n]; 
      for(int i = 0; i < n ;i++)
         {
            arr[i] = sc.nextInt();
         }
      
      for(int i = 0; i < n; i++)
         {
            int mis_ele = (i + 1);
            boolean missing = true;
            for(int j = 0; j < n; j++)
               { 
                 if( (mis_ele) == arr[j])
                   {
                      missing = false;
                      break;
                   }
               }
            if(missing == true)
              System.out.print(mis_ele) ;   
         }
     }
}