import java.util.*;

class Program105
{
    static void Digits(int Arr[], int iLength)
    {
        int i = 0;
        System.out.println("the three digits numbers is : ");

        for(i = 0; i < iLength; i++)
        {
            if((Arr[i] > 99) &&(Arr[i] < 999))
            {
                System.out.println(Arr[i]);
            }
        }
    }
    public static void main(String[] Agv)
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;

        System.out.println("Hwo many numbers you want to aaadd in array : ");
        int iSize = sobj.nextInt();

        int P[] = new int[iSize];

        System.out.println("Enter the numbers : ");

        for(i = 0; i < iSize; i++)
        {
            P[i] = sobj.nextInt();
        }

        Digits(P, iSize);

    }
}