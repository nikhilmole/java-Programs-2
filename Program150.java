import java.util.*;

class Program150
{
    static void Display(char[] str)
    {
        int Start = 0;
        int End = str.length - 1;

        while(str[Start] < str[End])
        {
            int j = 0;

            while(str[j] < str[End])
            {
                System.out.print(str[j]+"\t");
                j++;
            }
            Start++;
            System.out.println();
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();
        char[] CharArr = Arr.toCharArray();

        Display(CharArr);
    }
}