import java.util.*;

class Program153
{
    static void Display(char[] str)
    {
        int End = str.length;   
        int i = 0;
        int j = 0;

        for(i = 0; i < End; i++)
        {
            for(j = 0; j < End; j++)
            {
                if(i >= j)
                {
                    System.out.print(str[j]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
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