import java.util.*;

class Program192
{
    static int OnBit(int iNum, int iPos)
    {
        int iMask = 0;
        int iResult = 0;

        iMask = 1 << (iPos - 1);

        iResult = iMask | iNum;

        return iResult;

    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the position : ");
        int iValue = sobj.nextInt();

        int iRet = OnBit(iNo, iValue);
        System.out.println("Updated number is : "+iRet);

    }
}