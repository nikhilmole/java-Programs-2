import java.util.*;

class Program184
{
    static int ONBit(int iNum)
    {
        int iResult = 0;
        int iMask = 0x0F;

        iResult = iMask | iNum;
        
        return iResult;
    }

    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        int iRet = ONBit(iNo);

        System.out.println("The updated number is : "+iRet);
    }
}