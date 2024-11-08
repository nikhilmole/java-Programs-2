import java.util.*;


class Program166
{
    static int iSum = 0;

    static int DigiSum(int iNum)
    {
        int iDigit = 0;

        if(iNum > 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
            DigiSum(iNum);
        }
        return iSum;
    }
    public static void main(String[] argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        int iRet = DigiSum(iNo);
        System.out.println("The summation of digits are : "+iRet);
    }
}