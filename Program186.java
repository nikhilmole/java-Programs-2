import java.util.*;

class Program186
{
    static void CommonBit(int iNum1, int iNum2)
    {
        int CommonBit = iNum1 & iNum2;
        int Position = 0;

        while(CommonBit > 0)
        {
            if((CommonBit & 1) == 1)
            {
                System.out.println("The common bits are : "+Position);
            }
            CommonBit >>= 1;
            Position++;
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the First number : ");
        int iNo2 = sobj.nextInt();

        CommonBit(iNo1, iNo2);
    }
}