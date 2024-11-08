import java.util.*;

class Program139
{ 
    static void StrConver(char[] str, char[] dest)
    {
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if((str[Start] >= 'A')&&(str[Start] <= 'Z'))
            {
                dest[Start] = str[Start];
            }

            else if((str[Start] >= 'a')&&(str[Start] <= 'z'))
            {
                dest[Start] = (char)(str[Start] - 32);
            }
            else
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

        char[] CharArr = Arr.toCharArray();

        StrConver(CharArr, Brr);

        System.out.println(Brr);
    } 
}