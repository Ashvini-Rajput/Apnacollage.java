import java.util.*;
public class ArrayCC
{
    public static void main(String arg[])

    {
        int marks[]= new int [100];
        Scanner sc = new Scanner (System.in);

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math

        System.out.println("phy:" +marks[0]);
        System.out.println("che:" +marks[1]);
        System.out.println("math:" +marks[2]);

        marks[2] = marks[2] + 1; //math update marks

        System.out.println("math:" +marks[2]);

        int percentage = (marks[0] + marks[1] + marks [2]) / 3;
        
        System.out.println("percentage =" + percentage +"%");
        // length mrasurement :System.out.println("length of array ="+marks.length); 
    
    }
}