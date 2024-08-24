import java.util.*;
public class CheckIncome
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int income  = sc.nextInt();
        
        int tax  = 0;
        if (income < 500000)
        {
            System.out.println("tax is zero");
        }
        else if (income >= 500000 && income < 100000)
        {
         tax = (int)(income * 0.2);
        }
        else{
            tax = (int) (income*0.3);
        }
        System.out.println("your tax is:"+tax);
    }
}
