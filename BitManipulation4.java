import java.util.*;
public class BitManipulation4
{
    public static int ClearIthBit(int n ,int i)
    {
        int bitMask = ~(1<<i);
        return n & bitMask;   // 8

    }
    public static void main(String arg[])
    {
         System.out.println(ClearIthBit(10 ,1));
    }
}