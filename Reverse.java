import java .util.*;
public class reverse
{
    public static void main(String arg[])
    {
        int iRev = 0;
        int iNo = 10899;
        int iDigit = 0;
        while (iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev*10)+ iDigit;
            iNo = iNo / 10 ;
        }
        System.out .println(iRev);
    }
}