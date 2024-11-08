import java.util.*;

class Program175
{
    static boolean ChkBit(int iNum)
    {
        int iResult = 0;
        int iMask = 16384;

        iResult = iNum & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] Argv)
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        bRet = ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("The 15th bit is on");
        }
        else
        {
            System.out.println("The 15th bit is off");
        }
    }
}