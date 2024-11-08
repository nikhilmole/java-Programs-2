class node
{
    public node next;
    public int data;

    public node(int iNo)
    {
        next = null;
        data = iNo;
    }
}

class SinglyLL
{
    public node First;
    public int iCnt;

    public SinglyLL()
    {
        First = null;
        iCnt = 0;
    }

    public void Display()
    {
        node temp = First;

        if(First == null)
        {
            System.out.println("LL is empty");
            return;
        }
        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return iCnt;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(First == null)
        {
            First = newn;
        }

        else
        {
            newn.next = First;
            First = newn;
        }
        iCnt++;
    }

    public int Maxi()
    {
        int iMax = 0;
        int iMin = 0;
        node temp = First;

        while(temp != null)
        {
            iMin = temp.data;

            if(iMax < iMin)
            {
                iMax = iMin;
            }
            temp = temp.next;
        }
        return iMax;
    }   
}

class Program197
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();
        int iRet = 0;

        obj.InsertFirst(11);
        obj. InsertFirst(101);
        obj.InsertFirst(201);
        obj.InsertFirst(111);
        obj.InsertFirst(51);

        obj.Display();
        iRet = obj.Count();
        System.out.println("The node couont is :"+iRet);

        iRet = obj.Maxi();
        System.out.println("The maximum number is : "+iRet);
    }
}