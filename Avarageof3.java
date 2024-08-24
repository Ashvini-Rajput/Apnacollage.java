import java .util.*;
public class Avarageof3
{
    public static int Avarage (int iNo1, int iNo2, int iNo3)
    {
        int Avg = 0;
        Avg = (iNo1 + iNo2 + iNo3) / 3;
        return Avg;
        
    }
    public static void main(String arg[])
    {
        int A = 2;
        int B = 3;
        int C = 4;
        int iRet = 0;

         iRet = Avarage(A,B,C);
         System.out.println("Avarage is:" +iRet);
    }
}