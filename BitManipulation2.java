import java.util.*;
public class BitManipulation2
{
    public static int getIthBit(int n ,int i)
    {
        int bitMask = 1 << i;
        if ((n & bitMask ) == 0)
        {
            return 0;
        }
        else{
            return 1;
        }

    }
    public static void main(String arg[])
    {
         System.out.println(getIthBit(10 ,2));  // 0
         // System.out.println(getIthBit(10 ,3));  1
    }
}