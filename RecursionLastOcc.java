import java.util.*;

 public class RecursionLastOcc
{
  public static int LastOccurence(int arr[] ,int key,int i)
  {
   
      if (i == arr.length)
      {
         return -1;
      }
   int isFound = LastOccurance(arr , key , i+1);
   
  if(isFound != -1 && arr[i] == key)
  {
     return isFound;
  }
}

public static void main(String arg[])
 {
   int arr[] = { 8,3,6,9,6,10,2,5,3};
   System.out.println(LastOccurence(arr,5,0));
 }
}