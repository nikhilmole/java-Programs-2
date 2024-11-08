import java.util.*;

class Program117
{
    static int CountCapital(String str)
    {
        int iCount = 0;
        int index = 0;
        int Length = str.length();

        while(index < Length)
        {
            if((str.charAt(index) >= 'A')&&(str.charAt(index) <= 'Z'))
            {
                iCount++;
            }
            index++;
        }
        return iCount;

    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        int iRet = CountCapital(Arr);

        System.out.println("The capital laeeters are : "+iRet);
    }
}