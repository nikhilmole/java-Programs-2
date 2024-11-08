import java.util.*;

class Program121
{
    static void Reverse(char[] str)
    {
        int Start = 0;
        int End = str.length - 1;
        char temp = '\0';

        while(Start < End)
        {
            temp = str[End];
            str[End] = str[Start];
            str[Start] = temp;

            Start++;
            End--;
        }

    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();

        char[] CharArray = Arr.toCharArray();

        Reverse(CharArray);

        String Reverse = new String(CharArray);
        
        System.out.println(Reverse);
    }
}