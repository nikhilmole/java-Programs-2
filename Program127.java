import java.util.*;

class Program127
{
    static boolean ChkChar(char[] str, char ch)
    {
        boolean bFlag = false;
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if(str[Start] == ch)
            {
                bFlag = true;
            }
            Start++;
        }

        return bFlag;
    } 
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        System.out.println("Enter the character : ");
        String ch = sobj.nextLine();

        char Sch = ch.charAt(0);

        boolean bRet = false;

        bRet = ChkChar(CharArr,Sch);

        if(bRet == true)
        {
            System.out.println("The character is present");
        }
        else
        {
            System.out.println("The character is not present");
        }
    }
}