import java.util.*;

class Program180
{
    static int OffBit(int iNum)
    {
        int iResult = 0;
        int iMask = 0xFFFFFFBF;
        
        iResult = iMask & iNum;

        return iResult;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the  Number : ");
        int iNo = sobj.nextInt();

        int iRet  = OffBit(iNo);

        System.out.println("Updated number is : "+iRet);
    }
}