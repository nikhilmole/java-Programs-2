import java.util.*;

class Program145
{
    static void ReverseStringWithToggle(char[] str)
    {
        int Start = 0;
        int End = str.length-1;
        char temp = '\0';

        while(Start < End)
        {
            if(str[Start] >= 'A' && str[Start] <= 'Z')
            {
                str[Start] = (char) (str[Start] + 32);
            }

            else if(str[Start] >= 'a' && str[Start] <= 'z')
            {
                str[Start] = (char)(str[Start] - 32);
            }

            if(str[End] >= 'A' && str[End] <= 'Z')
            {
                str[End] = (char)(str[End] + 32);
            }

            else if(str[End] >= 'a' && str[End] <= 'z')
            {
                str[End] = (char)(str[End] - 32);
            }

            temp = str[End];
            str[End] = str[Start];
            str[Start] = temp;

            Start++;
            End--;

        }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        ReverseStringWithToggle(CharArr);

        System.out.println(CharArr);
    }
}