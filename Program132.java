
class Program132
{
    static void StrCpy(char[] str, char[] dest)
    {
        int Start = 0;
        int End = str.length;

        while(Start < End)
        {
            dest[Start] = str[Start];

            Start++;
        }
    }
    public static void main(String[] Argv)
    {
        String Arr = "Marvellous Multi Os";

        char[] Brr = new char[Arr.length()];

        char[] CharArr = Arr.toCharArray();

        StrCpy(CharArr,Brr);

        String Update = new String(Brr);

        System.out.println("Copy String is : "+Update);
    }
}