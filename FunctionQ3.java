import java.util.*;
public class FunctionQ3
{

    public static boolean CheckEvenOdd(int iNo)
    {
        if((iNo % 2) == 0)
        {
             return true;
        }
        else
        {
           return  false;
        }
    }
    public static void main(String arg[])
     { 
        Scanner sc = new Scanner (System.in);
        boolean bRet = false;
        System.out.println("Enter a number");
        int iValue =  sc.nextInt();

          bRet = CheckEvenOdd(iValue);

        if (bRet == true)
        {
            System.out.println(" %d Even Number" +iValue);
        }
        else 
        {
            System.out.println("  %d Odd Number" +iValue);
        }

     }
}