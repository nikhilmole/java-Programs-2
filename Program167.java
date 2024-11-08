import java.util.*;

class Program167
{
    static int Strlen(char[] str)
    {
        return str.length;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] CharArray = Arr.toCharArray();

        int iRet = Strlen(CharArray);
        System.out.println("The string length is : "+iRet); 
    }
}