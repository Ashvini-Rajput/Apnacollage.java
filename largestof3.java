import java.util.*;
public class largestof3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        int income  = sc.nextInt;
        int A  = 1, B = 3,C = 6;
        if ((A >= B) && (A >= C))
        {
            System.out.println("A ");
        }
        else if ((B >= A) && (B >= C))
        {
         System.out.println("B");
        }
        else ((C >= A) && (C >= B))
        {
            System.out.println("C");
        }
        
    }
}
