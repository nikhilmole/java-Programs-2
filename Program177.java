import java.util.*;

class Program177
{
    static boolean ChkBit(int iNum)
    {
        int iResult = 0;
        int iMask = 135282752;

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

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        bRet = ChkBit(iNo);

        if(bRet == true)
        {
            System.out.println("5 15 21 28 bit is on ");
        }
        else
        {
            System.out.println("5 15 21 28 bit is off ");
        }
    }
}