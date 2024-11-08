import java.util.*;

class Program174
{
    static int iRev = 0;
    static int Rev(int iNo)
    {
        int iDigit = 0;

        if(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;

            Rev(iNo);
        }
        return iRev;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        int iRet = Rev(iNo);
        System.out.println(iRet);
    }
}