import java.util.*;

class Program152
{
    static void Display(char[] str)
    {
        int i = 0;
        int j = 0;
        int iCnt = str.length-1;

        for(i = 0; i <= iCnt; i++)
        {
            for(j = 0; j <= iCnt; j++)
            {
                if(j <= iCnt - i)
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
    public static void main(String[] Adr)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArr = Arr.toCharArray();

        Display(CharArr);
    }
}