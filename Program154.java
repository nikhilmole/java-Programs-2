import java.util.*;

class Program154
{
    static void Display(char[] str)
    {
        int End = str.length;
        int i = 0;

        while(i < End)
        {
            int j = 0;

            while(j < End)
            {
                if((str[j] >= 'a')&&(str[j] <= 'z'))
                {
                    str[j] = (char)(str[j] - 32); 
                }
                System.out.print(str[j]+"\t");
                j++;
            }
            System.out.println();
            i++;
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