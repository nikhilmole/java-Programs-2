import java.util.*;

class Program170
{
    static int iCount = 0;
    static int Start = 0;

    static int CountWhite(char[] str)
    {
        int End = str.length;

        if(Start < End)
        {
            if(str[Start] == ' ')
            {
                iCount++;
            }
            Start++;
            CountWhite(str);
        }
        return iCount;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();
        char[] CharArr = Arr.toCharArray();
        int iRet = CountWhite(CharArr);
        System.out.println(iRet);
    }
}