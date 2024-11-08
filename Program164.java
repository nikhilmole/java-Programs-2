import java.util.*;

class Program164
{
    static int i = 0;

    static void Display(int iNum, char ch)
    {
        if(iNum < 0)
        {
            iNum = -iNum;
        }

        if((i <= iNum)&&(ch != ' '))
        {
            System.out.print(ch+"\t");
            ch++;
            i++;
            Display(iNum,ch);
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        char ch = Arr.charAt(0);
        
        Display(iNo,ch);
    }
}