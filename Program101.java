import java.util.*;

class Program101
{
    static int Product(int Arr[], int iLength)
    {
        int i = 0;
        int iPro = 1;

        for(i = 0; i < iLength; i++)
        {
            if(Arr[i] % 2 != 0)
            {
                iPro = iPro * Arr[i];
            }
        }
        return iPro;
    }
    public static void main(String[] argv)
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;

        System.out.println("How many numbers you want to add in array : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");

        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        int iRet = Product(P, iSize);
        System.out.println("The Product is : "+iRet);
    }
}