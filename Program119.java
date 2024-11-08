import java.util.*;

class Program119
{
    static int Dif(String Arr)
    {
        int iCountCapi = 0;
        int iCountSmall = 0;
        int Index = 0;
        int Length = Arr.length();

        while(Index < Length)
        {
            if((Arr.charAt(Index) >= 'A')&&(Arr.charAt(Index) <= 'Z'))
            {
                iCountCapi++;
            }
            else
            {
                iCountSmall++;
            }
            Index++;
        }
        return iCountCapi - iCountSmall;

    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        int iRet = Dif(str);
        System.out.println("the dif is : "+iRet);
    }
}