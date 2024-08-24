import java .util.*;
public class Digit
{
    public static void main(String arg[])
    {
        int iDigit = 0;
        int iNo = 10899;
        while (iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit +" ");

            iNo = iNo / 10;
        }
        System.out.println();
    }
}