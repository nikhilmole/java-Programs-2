import java.util.*;

class Program147
{
    static int WordCount(char[] str)
    {
        int iCnt = 0;
        int Start = 0;
        int End = str.length;
        boolean inword = false;

        if(End == 0)
        {
            return -1;
        }

        while(Start < End)
        {
            if(str[Start] == ' ')
            {
                inword = false;
            }

            else if(! inword)
            {
                inword = true;
                iCnt++;
            }
            Start++;
        }
        return iCnt;

    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        int iRet = WordCount(CharArr);
        System.out.println(iRet);
    }
}