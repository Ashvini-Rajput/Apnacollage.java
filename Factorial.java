import java.util.*;
public class Factorial
{  
      public static int factorial(int iNo)
     
    {
          int i = 0;
          int f = 1;
          for(i=1; i<=iNo; i++)
        {
            //if (iNo % i)
            f = f * i;
        }
        return f;
       
    }
    public static void main(String arg[])
    {
       factorial(4);
       System.out.println("the factor is" + factorial(4));
    }
}