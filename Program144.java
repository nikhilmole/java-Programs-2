import java.util.*;

class Program144
{
    static boolean StrCmpX(String str, String dest, int iNo)
    {
        int Start = 0;
        
        while((Start < str.length())&&(Start < dest.length())&&(iNo > 0))
        {
            if(str.charAt(Start) != dest.charAt(Start))
            {
                return false;
            }

            Start++;
            iNo--;
        }

        if(iNo == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] Argv)
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the Second string : ");
        String Brr = sobj.nextLine();

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        bRet = StrCmpX(Arr, Brr, iNo);
        if(bRet == true)
        {
            System.out.println("First " +iNo+ " String is same");
        }
        else
        {
            System.out.println("First " +iNo+ " String is not same");
        }
    }
}