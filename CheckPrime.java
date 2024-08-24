import java.util.*;
public class CheckPrime
{
    public static boolean Checkprime(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }
        for (iCnt = 2; iCnt <= iNo-1; iCnt++)
        {
            if ((iNo % iCnt) == 0)
            {
                iCount++;
                break;
            }
        }
        if (iCount == 0)
        {
          return true;
        }
        else
        {
        return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        boolean bRet = false;

         System.out.println("Enter a number");
         int iValue = sc.nextInt();

         bRet = Checkprime(iValue);
          
        if (bRet == true)
        {
            System.out.println("Prime:"+iValue);
        }
        else{
            System.out.println(" not Prime:"+iValue);
        }
    }
}