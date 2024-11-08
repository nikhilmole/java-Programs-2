import java.util.*;

class Program160
{
    static int i = 1;

    static void Display(int iNum)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }

        if(i <= iNum)
        {
            System.out.print("*\t");
            i++;
            Display(iNum);
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Display(iNo);
    }
}