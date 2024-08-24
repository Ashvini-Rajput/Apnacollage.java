import java .util.*;
public class FunctionOverloading
{
    public static int sum(int A,int B)
    {
        return A+B ;
    }
    public static float sum(float A,float B,float C)
    {
        return A+B+C ;
    }
    public static void main(String arg[])
    {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,2));
    }
}