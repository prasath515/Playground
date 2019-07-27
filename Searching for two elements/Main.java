import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0; i<n; i++)
  {
    arr[i] = sc.nextInt();
  }
  int sec_ele1 = sc.nextInt(),sec_ele2 = sc.nextInt();
  int indx_ele1 = -1,indx_ele2 = -1;
  for(int j=0; j<n; j++)
  {
    if(arr[j] == sec_ele1 || arr[j] == sec_ele2)
    {
      if(arr[j] == sec_ele1)
        indx_ele1 = j;
      else
        indx_ele2 = j;
    }
  }
    System.out.println(indx_ele1);
   System.out.println(indx_ele2);
}
}