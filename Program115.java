import java.util.*;


class Program115
{
    static boolean ChkSymbol(char ch)
    {
        boolean bFlag = false;

        if((ch == '!')||(ch == '@')||(ch == '#')||(ch == '$')||(ch == '%')||(ch == '^')||(ch == '&')||(ch == '*'))
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

        bRet = ChkSymbol(cValue);

        if(bRet == true)
        {
            System.out.println("It is a special symbol");
        }
        else
        {
            System.out.println("It is not a special symbol");
        }
    }
}