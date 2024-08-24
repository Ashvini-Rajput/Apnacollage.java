import java .util.*;
public class  Recursion3
{
public static int calSum(int n)
{
    if(n == 1)
    {
        return 1;
    }
    int Snm1 = calSum(n-1);
    int sn = n + Snm1 ;
    return sn;
}
public static void main(String arg[])
 {
    int n = 5;
    System.out.print(calSum(n));
 }
}