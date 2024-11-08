import java.util.*;

class Program112
{
    static void ASCII()
    {
        int iNum = 0;

        for(iNum = 0; iNum <= 255; iNum++)
        {
            System.out.println(iNum+"="+(char)iNum);
        }
    }
    public static void main(String[] Argv)
    {
        ASCII();
    }
}