import java.util.*;

class Program173
{
    static int iMin = 9;

    static int Min(int iNo)
    {
        int iDigit = 0;
        
        if(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iMin > iDigit)
            {
                iMin = iDigit;
            }
            iNo = iNo / 10;
            Min(iNo);
        }
        return  iMin;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        int iRet = Min(iNo);
        System.out.println(iRet);
    }
}