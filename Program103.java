import java.util.*;

class Program103
{
    static int Min(int Arr[], int iLength)
    {
        int i = 0;
        int iMin = Arr[0];

        for(i = 0; i < iLength; i++)
        {
            if(iMin > Arr[i])
            {
                iMin = Arr[i];
            }
        }
        return iMin;
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

        int iRet = Min(P, iSize);
        System.out.println("The miimum number is : "+iRet);
    }
}