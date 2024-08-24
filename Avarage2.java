import util.java.*;
public class Avarage2
{
    public static void main(String arg[])
    {
        int ivalue1 = 0;
        int ivalue2 = 0;
        int ivalue3 = 0;
        int iRet = 0;

        System.out.println("Enter a First Number");
         ivalue1 = sc.nextInt();

        System.out.println("Enter a Second Number");
         ivalue2 = sc.nextInt();

        System.out.println("Enter a Third Number");
         ivalue3 = sc.nextInt();

        iRet = (ivalue1 + ivalue2 + ivalue3 ) / 3;

        System.out.println("the avarage is %d"+iRet);
    }
}