import java.util.*;

class Program191
{
    static int OffBit(int iNum, int iPos)
    {
        int iMask = 0;
        int iResult = 0;

        iMask = ~(1 << (iPos - 1));

        iResult = iMask & iNum;

        return iResult;
    }       
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the NUmber : ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the position : ");
        int iValue = sobj.nextInt();

        int iRet = OffBit(iNo, iValue);
        System.out.println("The updated number is : "+iRet);
    }
}