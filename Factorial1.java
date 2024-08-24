import java.util.*;
public class Factorial1
{  
      public static int BinCoeff(int N,int R)
      {

        int fact_N = factorial(N);
        int fact_R = factorial(R);
        int fact_MNR = factorial(M-R);

        int BinCoeff = fact_n / (fact_R* fact_MNR);

        return BinCoeff; 
      }

      public static void main(String arg[])
      {
        System.out.println(BinCoeff(5 , 2));
        int factorial = 1;
    
      }
}
