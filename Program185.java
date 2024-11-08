import java.util.*;

class Program185
{
    static int CountOnBits(int iNum)
    {
        int iCnt = 0;

        while(iNum > 0)
        {
            iCnt = iCnt + (iNum & 1);
            iNum >>= 1;
        }
        return iCnt;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        int iRet = CountOnBits(iNo);

        System.out.println("On bits Are : "+iRet);
    }
}