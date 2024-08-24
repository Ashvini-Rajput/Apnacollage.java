import java.util.*;
public class BitManipulation
{
    public static void OddEven(int n){
    int bitMask = 1;
    
    if((n & bitMask) == 0)
    {
        // even number
        System.out.println("Even Number");
    }
    else
    {
        System.out.println("Odd Number");
    }
}
   public static void main(String args[])
  {
     OddEven(3);
     OddEven(11);
     OddEven(14); 
  }
}