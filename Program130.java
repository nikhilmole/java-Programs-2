import java.util.*;

class Program130
{
    static int FirstOcc(char[] str, char ch)
    {
        int Start = 0;
        int End = str.length;
        int iPose = -1;
        int iFreq = 1;

        while(Start < End)
        {
            if(str[Start] == ch)
            {
                iPose = iFreq;
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

        char[] charArr = Arr.toCharArray();

        System.out.println("Enter the character : ");
        String ch = sobj.nextLine();

        char Sch = ch.charAt(0);

        int iRet = FirstOcc(charArr, Sch);

        System.out.println("the First occ is : "+iRet);
    }
}