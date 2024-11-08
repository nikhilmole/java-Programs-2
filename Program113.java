import java.io.*;


class Program113
{
    static void Convert(char ch)
    {
        if((ch >= 'A')&&(ch <= 'Z'))
        {
            System.out.println((char)(ch + 32));
        }
        else if((ch >= 'a')&&(ch <= 'z'))
        {
            System.out.println((char)(ch - 32));
        }
        else
        {
            System.out.println(ch);
        }
    }
    public static void main(String[] Argv) 
    {
        try
        {
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the character : ");
            String str = bobj.readLine();
            char cValue = str.charAt(0);

            Convert(cValue);
        }
        catch(Exception obj)
        {

        }
    }
}