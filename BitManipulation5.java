import java.util.*;
public class BitManipulation5
{
    public static int updateIthBit(int n ,int i , int newBit)
    {
       /* if(newBit == 0)
        {
            return clearIthBit(n , i);
        }
        else{
            return setIthBit(n , i);
            }
      */ 
    
      n = clearIthBit(n ,i) ;
     int BitMask = newBit<<i;
     return n | BitMask;

    }
    public static void main(String arg[])
    {
         System.out.println(updateIthBit(10 , 2 ,1));
    }
}