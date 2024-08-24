import java.util.*;
public class binarytodecimal
{
    public static void bintodec(int binNum )
    {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0)
        {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int)Math.pow(2,pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + binNum + " = " + decNum);
     }
       public static void main(String arg[])
       {
         bintodec(1010); //10
       }
}
//Binary To Decimal Code