import java .util.*;
public class Function2
{
    public static int CalculateSum(int No1,int No2)
    { 
        int Sum = 0;
        Sum = No1 + No2; 
        return Sum;

    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int Value1 = 0 ;
        int Value2 = 0;
        int Ret = 0;

        System.out.println("Enter a First number");
        Value1 = sc.nextInt();

        System.out.println("Enter a Second number");
        Value2 = sc.nextInt();

        Ret = CalculateSum(Value1,Value2);

        System.out.println("the Sum is :"+Ret);
    }
}