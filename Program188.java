import java.util.*;

class Program188
{
    static Boolean ChkBit(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 1 << (iPos1 - 1);
        int iMask2 = 1 << (iPos2 - 1);

        int iResult1 = iMask1 & iNum1;
        int iResult2 = iMask2 & iNum2;

        if((iMask2 == iResult1)&&(iMask2 == iResult2))
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

        System.out.println("Enter the First position : ");
        int iNum1 = sobj.nextInt();

        System.out.println("Enter the second position : ");
        int iNum2 = sobj.nextInt();

        bRet = ChkBit(iNo, iNum1, iNum2);
        if(bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}