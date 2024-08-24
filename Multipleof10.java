import java.util.*;
public class Multipleof10
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        do
        {
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