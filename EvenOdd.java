import java.util.*;
 class EvenOdd
 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        int Number = sc.nextInt();

        if (Number % 2 ==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
 }