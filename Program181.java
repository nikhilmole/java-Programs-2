import java.util.*;

class Program181
{
    static int OffBit(int iNum)
    {
        int iResult = 0;
        int iMask = 0xFFFFFDBF;

        iResult = iMask & iNum;

        return iResult;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iRet = OffBit(iNo);
        System.out.println("The updated number is : "+iRet);
    }
}