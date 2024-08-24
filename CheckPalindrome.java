import java.util.*;
public class CheckPalindrome
{
    public static boolean Checkpalindrome(int iNo)
    {
        int Rev = 0;
        int iDigit ;
        int original = iNo;//store the original nmber to campare later

        while (iNo > 0)
        {
           iDigit = iNo % 10;
           Rev = (Rev*10) + iDigit;
           iNo = iNo / 10;
        }
           if (original == Rev)
           {
            return true;
           }
           else
           {
            return false;
           }
        }
        
    }
 public static void main(String arg[])

    {
        Scanner sc = new Scanner (System.in);
        boolean bRet = false;
        System.out .println("Enter a Number");
        int iValue = sc.nextInt();

        bRet =  Checkpalindrome(iValue);
      if(bRet == true)
      {
        System.out.println("is Palindrome no:" + iValue);
      }
      else
      {
        System.out.println("is not Palindrome no:" + iValue);
      }
    }
