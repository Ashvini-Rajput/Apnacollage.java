import java.util.*;
public class check_prime
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
    
            System.out.println("Enter a Number");
            int n = sc.nextInt;
            if(n == 2)
            {
                System.out.println("n is prime");

            }
            else
            {
                boolean is prime = true;
                for (int i = 2; i<=Math.sqrt(n); i++)
                {
                    if(n % i == 0)
                    {
                        // n is multiple of (i not equal to a or n)
                        is Prime = false  ;
                    }
                }
                if (isPrime == true )
                {
                    System.out.println("n is prime");
                }
                else{
                    System.out.println("n is not prime");
                }

            }
    }
}