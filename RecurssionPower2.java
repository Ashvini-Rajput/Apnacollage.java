import java .util.*;
public class Recurssionpower2
{
    public static int optimizePower(int a ,int n)
    {
        if(n == 0)
        {
            return 1;
        }
     int halfPowerSq  =  optimizePower(a, n \2) ; 
     int halfPowerSq = halfPower *halfPower;
    
    }
     //n is odd
     if(n % 2 != 0)
    {
      halfPowerSq = a * halfPowerSq;
    }
     return halfPowerSq;

     public static void main(String arg[])
     {
        int a = 2;
        int n = 10;
        System . out.println(optimizePower(a,n));

     }
}