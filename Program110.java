import java.util.*;

class Program110
{
    static boolean ChkCapitalorSmall(char ch)
    {
        boolean bFlag = false;

        if((ch >= 'a')&&(ch <= 'z'))
        {
            bFlag = true;
        }
        return bFlag;
    }
    public static void main(String[] Argv)
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        String str = sobj.nextLine();
        char cValue = str.charAt(0);

        bRet = ChkCapitalorSmall(cValue);
        if(bRet == true)
        {
            System.out.println("Small character");
        }
        else
        {
            System.out.println("Capital character");
        }

    }
}