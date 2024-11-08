import java.util.*;

class Program125
{
    static void DisplayDigit(char[] str)
    {
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if((str[Start] >= '0')&&(str[Start] <= '9'))
            {
                System.out.print(str[Start]);
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

        DisplayDigit(CharArr);
    }
}