import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i = 0; i < n ;i++)
  {
   arr[i] = sc.nextInt(); 
  }
  summing(arr,n);
}

public static void summing(int arr[],int n)
{
  boolean check = true;
 int sum = arr[0]+arr[1]+arr[2];
  for(int indx = 3; indx < n; indx = indx + 3 )
  {
    int cur_sum = arr[indx]+arr[indx+1]+arr[indx+2];
    if(cur_sum != sum)
      check = false;
  }
    if(check == true)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
}
}