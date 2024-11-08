import java.util.*;

class Program193
{
    static int Toggle(int iNum, int iPos)
    {
        int iResult = 0;
        int iMask = 0;

        iMask = 1 << (iPos -1);

        iResult = iMask ^ iNum;
        return iResult;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the Number : ");
        int iValue = sobj.nextInt();

        int iRet = Toggle(iNo, iValue);
        System.out.println("the updated number is : "+iRet);
    }
}