import java.util.*;

class Program135
{
    static void StrCpy(char [] str, char [] dest)
    {
        int Start = 0;
        int End = str.length;
        int DestIndex = 0;

        while(Start < End)
        {
            if((str[Start] >= 'a')&&(str[Start] <= 'z'))
            {
                dest[DestIndex] = str[Start];
                DestIndex++;
            }
            Start++;
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] Brr = new char[Arr.length()];

        char[] CharArr = Arr.toCharArray();

        StrCpy(CharArr, Brr);
        String Updated = new String(Brr);

        System.out.println("Small letteres : "+Updated);
    }
}