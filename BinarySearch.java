import java. util.*;
// Binary search
public class BinarySearch
{
    public static int binarySearch(int Number [] , int value)
    {
        int start = 0, end = Number.length-1;//(7 - 1)
        while(start == end)
        {
            int mid = (start + end) / 2;

            if(Number[mid] == value)
            {
                return mid;
            }
            if(Number[mid] < value)
            {
                start = mid + 1;
            }
            else
            {
                end  = mid - 1;
            }
        }
        return - 1;
    }
    public static void main(String arg[])
    {                 // 0,1,2,3,4, 5, 6, 
        int number[] = { 2,4,6,8,10,12,14};
        int value = 10;
        //binarySearch(Number);
        System.out.println("index for value is:" + BinarySearch(Number,value));
    }


}