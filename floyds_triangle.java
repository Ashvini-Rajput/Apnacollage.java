import java.util.*;
public class floyds_triangle
{
    public static void floyds_triangle(int iNo)
  {
    // outer
    int counter = 1;
    int i = 0 , j = 0;
    for( i = 1; i <= iNo; i++)
    {
        for( j = 1; j <= i; j++)
        {
            System.out.print(counter+ " ");
            counter ++;
        }
        System.out.println();
    }
  }

  public static void main(String arg[])
  {
    floyds_triangle(5);
  }
}
/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/