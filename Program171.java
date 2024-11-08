import java.util.*;

class Program171
{
    static int iMax = 0;
    static int Max(int iNo)
    {
        int iDigit = 0;
        
        if(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iMax < iDigit)
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;
            Max(iNo);
        }
        return iMax;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNum = sobj.nextInt();

        int iRet = Max(iNum);
        System.out.println(iRet);
    }
}