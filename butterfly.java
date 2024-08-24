import java.util.*;
public class butterfly
{
    public static void butterflys(int n)
    {
        // 1st half
        for (int i=1; i<=n; i++)
     {
            // stars
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            // spaces 2*(n-1)
            for(int j=1; j<=2*(n-1); j++)
            {
              System.out.print(" ");
            }

        //stars 
            for (int j=1; j<=i; j++)
            {
               System.out.print("*");
           }
     }
    }

    //2nd half
            for (int i=n; i>=; i--){
            // stars
            for (int j=1; j<=i; i++){
                System.out.print("*");
            }

            // spaces 2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //stars 
        for (int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
     }

public static void main(String arg[])
{
    butterflys(5);
}
}