import java.util.*;

class Program129
{
    static int ChkFirstOcc(char[] str, char ch)
    {
        int iFreq = 1;
        int iPose = -1;
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if(str[Start] == ch)
            {
                iPose = iFreq;
                break;
            }
            Start++;
            iFreq++;
        }
        return iPose;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        System.out.println("Enter the Character : ");
        String ch = sobj.nextLine();

        char Sch = ch.charAt(0);

        int iRet = ChkFirstOcc(CharArr, Sch);
        System.out.println("The First occ is : "+iRet);
    }
}