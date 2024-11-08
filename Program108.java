import java.util.*;

class Program108
{
    static boolean ChkAlphaCapi(char ch)
    {
        int i = 0;
        boolean bFlag = false;
        
        if((ch >= 'A')&&(ch <= 'Z'))
        {
            bFlag = true;
        }
        return bFlag;
    }
    public static void main(String[] Argv)
    {
        int i = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Entere the character : ");
        String str = sobj.nextLine();

        char cValue = str.charAt(0);

        bRet = ChkAlphaCapi(cValue);
        if(bRet == true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}