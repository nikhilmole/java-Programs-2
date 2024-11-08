import java.util.*;

class Program158
{
    static void Display(int iNum)
    {
        if(iNum > 0)
        {
            System.out.print(iNum+"\t");
            iNum--;
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