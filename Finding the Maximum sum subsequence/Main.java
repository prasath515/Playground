import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);																	
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
       arr[i] = sc.nextInt();
    int seq[] = new int[2*n];
    int start = 0;
    int end = 1;
    int count = 0;
     int idx = 0;
    for(int i = 0; i < n; i++)
       { 
        if(end < n)
        {
          if(arr[idx] > arr[end])
           {
              if(count < seq.length) 
                {
                   seq[count++] = start;
                   start = end;
                   seq[count++] = end-1;
                   //end = start;
                }
           }
              idx++;
              end++;
        }
      else if(end == n)
        {
           seq[count++] = start;
           seq[count++] = end-1; 
           seq[count] = end-1;
        }
       }
    int max = 0,sum ; 
    for(int i = 0; i < count; i = i+2 )
      {   sum = 0;
            int sidx = seq[i];
            int eidx = seq[i+1];
         for(int j = sidx; j <= eidx ; j++)
         {
            sum = sum + arr[j];
         }
        if(sum > max)
          {
            max = sum;
            sum = 0;
          }    
      }
    System.out.print(max);
  }
}