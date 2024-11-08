import java.util.*;

class Program161
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
            System.out.print(i+"\t");
            i++;
            Display(iNum);
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        Display(iNo);
    }
}