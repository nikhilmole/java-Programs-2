import java.util.*;


class Program172
{
    static int iCount = 0;
    static int Start = 0;

    static int CountSmall(char[] str)
    {
        int End = str.length;

        if(Start < End)
        {
            if(str[Start] >= 'a' && str[Start] <= 'z')
            {
                iCount++;
            }
            Start ++;
            CountSmall(str);
        }
        return iCount;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        int iRet = CountSmall(CharArr);
        System.out.println(iRet);
    }
}