import java.util.*;

class Program156
{
    static int i = 1;
    
    static void Display(int iNum)
    {
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

        System.out.println("Enter the String : ");
        int iNo = sobj.nextInt();

        Display(iNo);
    }
}