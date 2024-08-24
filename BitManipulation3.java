import java.util.*;
public class BitManipulation3
{
    public static int SetIthBit(int n ,int i)
    {
        int bitMask = 1<<i;
        return n | bitMask;  //14

    }
    public static void main(String arg[])
    {
         System.out.println(SetIthBit(10 ,2));
    }
}