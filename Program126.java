import java.util.*;

class Program126
{
    static int CountWhiteSpaces(char[] str)
    {
        int Start = 0;
        int End = str.length;
        int iCount = 0;

        while(Start < End)
        {
            if(str[Start] == ' ')
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

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        int iRet = CountWhiteSpaces(CharArr);

        System.out.println("The white space count is : "+iRet);
    }
}