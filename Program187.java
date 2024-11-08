import java.util.*;

class Program187
{
    static boolean OnorOff(int iNum)
    {
        int iResult = 0;
        int iMask = 2304;

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

        System.out.println("Enter the First number : ");
        int iNo = sobj.nextInt();

        bRet = OnorOff(iNo);

        if(bRet == true)
        {
            System.out.println("The 9th and 12th bit is on");
        }       
        else
        {
            System.out.println("The 9th and 12th bit is off");
        }
    }
}