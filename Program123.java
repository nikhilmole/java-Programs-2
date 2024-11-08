import java.util.*;

class Program123
{
    static void StrLowerToUpper(char[] str)
    {
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if((str[Start] >= 'a')&&(str[Start] <= 'z'))
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

        char[] ArrChar = Arr.toCharArray();

        StrLowerToUpper(ArrChar);

        String str = new String(ArrChar);

        System.out.println(str);
    }
}