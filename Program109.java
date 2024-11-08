import java.util.*;

class Program109
{
    static boolean ChkDigit(char ch)
    {
        boolean bFlag = false;
        

        if((ch >= '0')&&(ch <= '9'))
        {
            bFlag = true;
        }
        return bFlag;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        String str = sobj.nextLine();
        
        cValue = str.charAt(0);

        bRet = ChkDigit(cValue);
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