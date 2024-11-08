import java.util.*;

class Program169
{
    static int iPro = 1;
    static int Pro(int iNo)
    {
        int iDigit = 0;

        if(iNo > 0)
        {
            iDigit = iNo % 10;
            iPro = iPro * iDigit;
            iNo = iNo / 10;
            Pro(iNo);
        }

        return iPro;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj  = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        int iRet = Pro(iNo);
        System.out.println("The product is : "+iRet);

    }
}