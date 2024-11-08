import java.util.*;

class Program138
{
    static void WhiteRemove(char[] str, char[] dest)
    {
        int Start = 0;
        int End = str.length;
        int destIndex = 0;

        while(Start < End)
        {
            if(str[Start] != ' ')
            {
                dest[destIndex] = str[Start];
                destIndex++;
            }
            Start++;
        }
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();

        char Brr[] = new char[Arr.ength()];

        char[] CharArray = Arr.toCharArray();

        WhiteRemove(CharArray, Brr);

        System.out.println(Brr);
    }
}