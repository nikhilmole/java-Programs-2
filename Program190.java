import java.util.*;

class Program190
{
    static boolean ChkBit(int iNum, int iPos)
    {
        int iMask = 0;
        int iResult = 0;

        iMask = 1 << (iPos - 1);

        iResult = iMask & iNum;

        if(iMask == iResult)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();
        boolean bRet = false;

        System.out.println("Enter the position of bit you want to chek it is on or off : ");
        int iValue = sobj.nextInt();

        bRet = ChkBit(iNo, iValue);
        if(bRet = true)
        {
            System.out.println("ON");
        }
        else
        {
            System.out.println("Off");
        }
    }
}