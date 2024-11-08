import java.util.*;

class Program159
{
    static int i = 1;

    static void Display(int iNum, char ch)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }

        if((i <= iNum)&&(ch != ' '))
        {
            System.out.println(ch+"\t");
            ch++;
            i++;
            Display(iNum, ch);
        }   
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter the Character : ");
        String Arr = sobj.nextLine();
        
        char ch = Arr.charAt(0);

        Display(iNo,ch);
    }
}