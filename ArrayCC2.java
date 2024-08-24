import java.util.*;
public class ArrayCC2
{
    public static void update(int marks[])
    {
       int i = 0;
       for (i = 0; i<marks.length ;i++)
       {
          marks[i] = marks[i] + 1;
       }
    }
    public static void main(String arg[])
    {
        int marks[]= {97,98,99};
         update (marks);
        //to print are marks
            int i = 0;
         for (i = 0; i<marks.length ;i++)
         {
            System.out.println(marks[i]+" ");
         }
             System .out.println();
    }
}