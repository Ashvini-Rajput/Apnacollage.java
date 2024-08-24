import java.util.*;

 public class RecursionFirstOcc
{
  public static int FirstOccurence(int arr[] ,int key,int i)
  {
   
      if (i == arr.length)
      {
         return -1;
      }
   
  if(arr[i] == key)
  {
     return i;
  }
  return FirstOccurance(arr ,key,i+1);
}

public static void main(String arg[])
 {
   int arr[] = { 8,3,6,9,6,10,2,5,3};
   System.out.println(FirstOccurence(arr,5,0));
 }
}