import java.util.*;

class Program148
{
    static int WordCount(char[] str)                                                                                                    
    {
        int Start = 0;
        int End = str.length;
        int maxCount = 0;
        int currentCount = 0;

        while(Start < End)
        {
            if(str[Start] == ' ' || str[Start] == End)
            {
                if(currentCount > maxCount)
                {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
            else 
            {
                currentCount++;
            }
            Start++;
        }   

        if(currentCount > maxCount)
        {
            maxCount = currentCount;
        }

        return maxCount;
    }
    public static void main(String Argv[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        char[] charArr = Arr.toCharArray();

        int iRet = WordCount(charArr);

        System.out.println(iRet);
    }
}