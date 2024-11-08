import java.util.*;

class Program102
{
    static int Max(int Arr[], int iLength)
    {
        int i = 0;
        int iMax = Arr[0];

        for(i = 0; i < iLength; i++)
        {
            if(iMax < Arr[i])
            {
                iMax = Arr[i];
            }
        }
        return iMax;
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

        int iRet = Max(P, iSize);
        System.out.println("The maximum number is : "+iRet);
    }
}
