import jva.util.*;

class Program124
{
    static void Toggle(char[] str)
    {
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if((str[Start] >= 'A')&&(str[Start] <= 'Z'))
            {
                str[Start] = (char)(str[Start] + 32);
            }
            
            else if((str[Start] >= 'a')&&(str[Start] <= 'z'))
            {
                str[Start] = (char)(str[Start] - 32);
            }
            Start++;
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        Toggle(CharArr);

        String StrArr = new String(CharArr);

        System.out.println(StrArr);

    }
}