import java.util.*;


class Program118
{
    static int CountSmall(String str)
    {
        int iCount = 0;
        int Index = 0;
        int Length = str.length();

        while(Index < Length)
        {
            if((str.charAt(Index) >= 'a')&&(str.charAt(Index) <= 'z'))
            {
                iCount++;
            }
            Index++;
        }
        return iCount;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        int iRet = CountSmall(Arr);

        System.out.println("The small letters are : "+iRet);
    }
}