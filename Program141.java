import java.util.*;

class Program141
{
    static void Toggle(char[] str, char[] dest)
    {
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            if((str[Start] >= 'A')&&(str[Start] <= 'Z'))
            {
                dest[Start] = (char)(str[Start] + 32);
            }
            else
            {
                dest[Start] = (char)(str[Start] - 32);
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

        Toggle(CharArr, Brr);

        System.out.println(Brr);
    }
}