import java.util.*;

class Program136
{
    static String StrCnt(String Str1, String Str2)
    {
        Str1 = Str1 + Str2;

        return Str1;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First String");
        String Arr = sobj.nextLine();

        System.out.println("Enter the Second String");
        String Brr = sobj.nextLine();

        String Updated = StrCnt(Arr, Brr);

        System.out.println(Updated);
    }
}