import java.util.*;

class Program128
{
    static int ChkFreq(char[] str, char ch)
    {
        int iCount = 0;
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if(str[Start] == ch)
            {
                iCount++;
            }
            Start++;
        }
        return iCount;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Stirng : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        System.out.println("Enter the character : ");
        String ch = sobj.nextLine();

        char Sch = ch.charAt(0);

        int iRet = 0;

        iRet = ChkFreq(CharArr, Sch);
        
        System.out.println(iRet);
    }
}