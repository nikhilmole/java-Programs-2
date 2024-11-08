
class node
{
    public int data;
    public node next;

    public node(int iNo)
    {
        data = iNo;
        next = null;
    }
}

class SinglyLL
{
    public node First;
    int iCnt;

    public SinglyLL()
    {
        First = null;
        iCnt = 0;
    }

    public void Display()
    {
        node temp = null;
        temp = First;

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
        node newn = null;
        newn = new node(iNo);

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
    public int SearchLastOcc(int iNo)
    {
        int iCnt = 1;
        int iPos = -1;
        node temp = First;

        while(temp != null)
        {
            if(temp.data == iNo)
            {
                iPos = iCnt;
            }
            iCnt++;
            temp = temp.next;
        }

        return iPos;
    }
}

class Program195
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();
        int iRet = 0;

        obj.InsertFirst(101);
        obj.InsertFirst(11);
        obj.InsertFirst(101);
        obj.InsertFirst(51);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Last occurance is : "+iRet);

        iRet = obj.SearchLastOcc(101);
        System.out.println("Last occurance is : "+iRet);
    }
}