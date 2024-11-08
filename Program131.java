import java.util.*;

class Program131
{
    static void RevString(char[] str)
    {
        int Start = 0;
        int End = str.length-1;
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

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        RevString(CharArr);

        String Updated = new String(CharArr);

        System.out.println("Updated string is : "+Updated);
    }
}