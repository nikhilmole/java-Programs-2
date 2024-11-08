import java.util.*;

class N
{
    public int iLength;
    public int P[];

    public N(int iNo)
    {
        iLength = iNo;
        P = new int[iLength];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the numbers : ");
        int i = 0;

        for(i = 0; i < iLength; i++)
        {
            P[i] = sobj.nextInt();
        }
    }

    public int Dif()
    {
        int i = 0;
        int iMax = P[0];
        int iMin = P[0];
        int Ans = 0;

        for(i = 0; i < iLength; i++)
        {
            if(iMax < P[i])
            {
                iMax = P[i];
            }

            else if(iMin > P[i])
            {
                iMin = P[i];
            }
        }
        Ans = iMax - iMin;
        return Ans;
    }
}

class Program104
{
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("How many numbers you want to add in array : ");
        int iSize = sobj.nextInt();

        N nobj = new N(iSize);

        nobj.Accept();
        int iRet = nobj.Dif();
        System.out.println("The diff between Max and Min numbers is : "+iRet);
    }
}