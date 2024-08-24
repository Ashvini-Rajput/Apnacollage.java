 import java.util.*;
 public class BoubleSort
{
    public static void bubblesort(int Arr[])
    {
         int temp;
        int i = 0,j = 0;
        for (i = 0; i <Arr.length-1; i++)
        {
            for(j = 0; j<Arr.length-1-i; j++)
            {
                if (Arr[j] > Arr[j + 1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
    }
        public static void printArr(int Arr[])
    {
         for(int i = 0; i< Arr.length; i++)
         {
         System.out.print(Arr[i]+" ");
    }
    
    System.out.println();
    }
  public static void main(String args[])
  {
    int Arr[] = {5,4,1,3,2};
    bubblesort(Arr);
    printArr(Arr);

 }
}