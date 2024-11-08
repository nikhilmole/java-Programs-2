import java.util.*;


class Program134
{
    static void StrCapCpy(char[] str, char[] dest)
    {
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if((str[Start] >= 'A')&&(str[Start] <= 'Z'))
            {
                dest[Start] = str[Start];
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

        char[]  CharArr = Arr.toCharArray();

        StrCapCpy(CharArr,Brr);

        String Updated = new String(Brr);

        System.out.println(Updated);
    }
}