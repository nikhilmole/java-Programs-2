import java.util.*;

class Program189
{
    static int ToggleBit(int iNum, int iStart, int iEnd)
    {
        int iResult = 0;
        int iMask = 0;
        int i = 0;

        for(i = iStart; i <= iEnd; i++)
        {
            iMask = (1 << (i - 1));
        }

        iResult = iMask ^ iNum;

        return iResult;

    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the Starting position : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the Ending position : ");
        int iValue2 = sobj.nextInt();

        int iRet = ToggleBit(iNo, iValue1, iValue2);
        System.out.println(iRet);
    }
}