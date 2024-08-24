import java.util.*;

public class PalindromeString
{
    public static boolean printpalindrome(String str)
    {
        int i = 0;
        int n = str.length();
        for(i = 0; i<str.length()/2; i++)
        {
          if(str.charAt(i) != str.charAt(n-1-i))
          // not a palindrome
          {
           return false;
          }
        }
        return true;
    }
     public static void main(String arg[])
    {
        String str = "racecar";

        System.out.println(printpalindrome (str));
    }
}