import java.util.*;

class Program106
{
    static void SumofDigits(int Arr[], int iLength)
    {
        int i = 0;
        int iNo = 0;
        int iSum = 0;
        int iDigit = 0;

        System.out.println("The three digits num addithion is : ");
        for(i = 0; i < iLength; i++)
        {
            iNo = Arr[i];
            iSum = 0;
            while(iNo > 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }
            System.out.println(iSum);
        }
    }

    public static void main(String[] Argv)
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add in array : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");
        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        SumofDigits(P, iSize);
    }
}