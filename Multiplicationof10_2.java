import java.util.*;
public class Multiplicationof10_2
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        do
        {
            System.out.println("Enter a Number");
            int n = sc.nextInt;
            if(n % 10 == 0)
            {
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}