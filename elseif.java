import java.util.*;
public class if-else
{
    public static void main(String arg[])
    {
        int age = 22;
        if(age >= 18)
        {
           System .out.println("adult:drive,vote") ;
        }
         else if(age >= 13 &&  age < 18)
        {
            System.out.println("teenager");
        }
        else
        {
           System.out.println("child");
        }
    }
}