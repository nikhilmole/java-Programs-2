import java.util.*;

class Program163
{
    static int i = 1;

    static void Display(int iNum, char ch)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }

        if(iNum >= i && ch != '\0')
        {
            System.out.print(ch+"\t");
            ch++;
            i++;
            Display(iNum, ch);
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        char ch = Arr.charAt(0);

        Display(iNo, ch);
    }
}