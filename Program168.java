import java.util.*;

class Program168
{
    static int i = 1;
    static int ifacto = 1;

    static int Facto(int iNo)
    {
        if(i <= iNo)
        {
            ifacto = ifacto * i;
            i++;
            Facto(iNo);
        }

        return ifacto;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iValue = sobj.nextInt();

        int iRet = Facto(iValue);
        System.out.println("The factorial are : "+iRet);
    }
}