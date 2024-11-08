import java.util.*;

class Program146
{
    static boolean Palindrome(char[] str)
    {
        int Start = 0;
        int End = str.length - 1;

        while(Start < End)
        {
            if(str[Start] >='A' && str[Start] <= 'Z')
            {
                str[Start] = (char)(str[Start] + 32);
            }
            if(str[End] >='A' && str[End] <= 'Z')
            {
                str[End] = (char)(str[End] + 32);
            }

            while(str[Start] != str[End])
            {
                return false;
            }

            Start++;
            End--;
        }
        return true;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;
        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        bRet = Palindrome(CharArr);

        if(bRet == true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Non Palindrome");
        }
    }
}