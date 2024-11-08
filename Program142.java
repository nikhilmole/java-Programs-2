import java.util.*;

class Program142 {
    static void StrCnt(StringBuilder str, String dest, int iNo) 
    {
        int originalLength = str.length();
        
        for (int i = 0; i < iNo && i < dest.length(); i++) 
        {
            str.append(dest.charAt(i));
        }
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the second string: ");
        String Brr = sobj.nextLine();

        StringBuilder CharArr = new StringBuilder(Arr);

        System.out.println("Enter the number of characters to add: ");
        int iNo = sobj.nextInt();

        StrCnt(CharArr, Brr, iNo);

        System.out.println(CharArr.toString());
    }
}
