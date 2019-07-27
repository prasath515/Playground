import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    remove_vowels(str);
  }
  public static void remove_vowels(String str)
  {
    String res = "";
    for(int i = 0; i < str.length(); i++)
    {
       //char ch = Character.toLowerCase(str.charAt(i));
      if(!is_vowel(Character.toLowerCase(str.charAt(i))))
      {
        res = res + str.charAt(i);
      }    
    }  
    System.out.print(res);
  }
  public static boolean is_vowel(char ch)
  {
    String vowels = "aeiou";
    for(int i = 0; i < vowels.length(); i++)
    {
      if(ch == vowels.charAt(i))
         return true;
    }
    return false;
  }
}