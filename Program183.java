import java.util.*;

class Program183
{
    static int Toggle(int iNum)
    {
        int iMask = 0x00000240;
        int iResult = 0;

        iResult = iMask ^ iNum;

        return iResult;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number in decimal : ");
        int iNo = sobj.nextInt();

        int iRet = Toggle(iNo);

        System.out.println("the updated number is : "+iRet);

    }
}