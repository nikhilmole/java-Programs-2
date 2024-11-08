import java.util.*;

class Program182
{
    static int Toggle(int iNum)
    {
        int iResult = 0;
        int iMask = 0x00000040;

        iResult = iMask ^ iNum;

        return iResult;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        int iRet = Toggle(iNo);
        System.out.println("The updated number is : "+iRet);
    }
}