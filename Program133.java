import java.util.*;

class Program133
{
    static void StrCpy(char[] str, char[] dest, int iCnt)
    {
        int Start = 0;
        int End = str.length;

        while((Start < End)&&(iCnt > 0))
        {
            dest[Start] = str[Start];

            Start++;
            iCnt--;
        }
    }

    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] Brr = new char[Arr.length()];

        char [] CharArr = Arr.toCharArray();

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        StrCpy(CharArr, Brr, iNo);

        String Updated = new String(Brr);

        System.out.println("Copy string is : "+Updated);
    }
}