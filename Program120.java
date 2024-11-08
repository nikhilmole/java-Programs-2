import java.util.*;

class Program120
{
    static boolean ChkVowels(String str)
    {
        int Index = 0;
        int Length = str.length();
        boolean bFlag = false;

        while(Index <  Length)
        {
            if((str.charAt(Index) == 'A')||(str.charAt(Index) == 'E')||(str.charAt(Index) == 'I')||(str.charAt(Index) == 'O')||(str.charAt(Index) == 'U')||
            (str.charAt(Index) == 'a')||(str.charAt(Index) == 'e')||(str.charAt(Index) == 'i')||(str.charAt(Index) == 'o')||(str.charAt(Index) == 'u'))
            {
                bFlag = true;
            }
            Index++;
        }
        return bFlag;
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the String");
        String Arr = sobj.nextLine();

        bRet = ChkVowels(Arr);
        if(bRet == true)
        {
            System.out.println("Vowel present");
        }
        else
        {
            System.out.println("Vowel not present");
        }   
    }
}