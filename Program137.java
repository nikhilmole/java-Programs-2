import java.util.*;

class Program137
{
    static void StrCpyRev(char[] str, char[] dest)
    {
        int Start = 0;
        int End = str.length-1;

        while(End >= 0)
        {
            dest[Start] = str[End];

            Start++;
            End--;
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();
        
        char[] Brr = new char[Arr.length()];
        
        char[] CharArr = Arr.toCharArray();

        StrCpyRev(CharArr, Brr);

        String result = new String(Brr);

        System.out.println(result);
    }
}