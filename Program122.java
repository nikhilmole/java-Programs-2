import java.util.*;

class Program122
{
    static void StrUpperToLower(char[] str)
    {
        int Start = 0;
        int End = str.length-1;

        while(Start <= End)
        {
            if((str[Start] >= 'A')&&(str[Start] <= 'Z'))
            {
                str[Start] = (char)(str[Start] + 32);
            }
            Start++;
        }

    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] Output = Arr.toCharArray();

        StrUpperToLower(Output);

        String Updated = new String(Output);

        System.out.println(Updated);
    }
}