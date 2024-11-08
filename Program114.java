import java.util.*;

class Program114
{
    static void Display(char ch)
    {
        int i = 0;

        if((ch >= 'A')&&(ch <= 'Z'))
        {
            for(i = ch; i <= 'Z'; i++)
            {
                System.out.println((char)(i));
            }
        }
        else if((ch >= 'a')&&(ch <= 'z'))
        {
            for(i = ch; i <= 'z'; i++)
            {
                System.out.println((char)(i));
            }
        }
        else
        {
            System.out.println("Invalid option");
        }
    }
    public static void main(String[] Argv)
    {
        char cValue = '\0';
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character : ");
        String str = sobj.nextLine();

        cValue = str.charAt(0);
        
        Display(cValue);
    }
}