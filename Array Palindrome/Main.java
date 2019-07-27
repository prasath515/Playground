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
      int front = 0;
      int end = n-1;
      boolean palindrome = true;
      while(front < end)
         {
          if(arr[front] != arr[end])
             { 
                 palindrome = false;
            	 break;              
             }
             front++;
        	 end--;
         }
      if(palindrome == true)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}