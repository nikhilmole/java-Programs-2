import java.util.*;

class Program143
{
    static boolean StrCmpX(String str, String dest)
    {
        if(str.equals(dest))
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

        System.out.println("Enter the First String : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the Second String : ");
        String Brr = sobj.nextLine();

        bRet = StrCmpX(Arr, Brr);
        if(bRet == true)
        {
            System.out.println("Both Strings Are same ");
        }
        else
        {   
            System.out.println("Both string are not same");
        }
    }
}