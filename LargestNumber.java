import java.util.*;
public class LargestNumber
{
    public static int getLargest(int iNo[])
    {
        int largest = Integer.MIN_VALUE; //-Infinity
        int Smallest = Integer.MAX_VALUE; 

    for(int i = 0; i < iNo.length; i++)
    {
        if(largest < iNo[i])
        {
            largest = iNo[i];
        }
        if(Smallest > iNo[i])
        {
            Smallest = iNo[i];
        }
    }
    System.out.println("Smallest value is:" + Smallest);
    return largest;

   }
public static void main(String arg[] )
  {
    int iNo[] = {1,2,6,3,5};
    System.out.println("largest value is:" +getLargest(iNo));
  }
}