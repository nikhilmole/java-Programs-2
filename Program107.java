import java.util.*;


class Program107
{
    static boolean ChkAlpha(char ch)
    {
        boolean bFlag = false;

        if((ch >= 'A')&&(ch <= 'Z')||(ch >= 'a')&&(ch <= 'z'))
        {
            bFlag = true;
        }

        return bFlag;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;

        System.out.println("Enter the character : ");
        String str = sobj.nextLine();

        char cValue = str.charAt(0);

        bRet = ChkAlpha(cValue);
        if(bRet == true)
        {
            System.out.println("True");
        }
        else 
        {
            System.out.println("false");
        }
    }  
}