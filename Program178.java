import java.util.*;

class Program178
{
    static boolean ChkBit(int iNum)
    {
        int iResult = 0;
        int iMask = 488;

        iResult = iMask & iNum;

        if(iResult == iMask)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        bRet = ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("The 7 8 9 bit is on");
        }
        else
        {
            System.out.println("The 7 8 9 bit is off");
        }
    }
}