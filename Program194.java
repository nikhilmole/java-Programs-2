
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
    public int SearchFirstOcc(int iNo)
    {
        int iPos = 1;
        node temp = null;
        temp = First;
        while(temp != null)
        {
            if(temp.data == iNo)
            {
                return iPos;
            }
            iPos++;
            temp = temp.next;
        }
        return -1;
    }
}

class Program194
{
    public static void main(String[] Argv)
    {
        SinglyLL obj = new SinglyLL();

        int iRet = 0;

        obj.InsertFirst(70);
        obj.InsertFirst(60);
        obj.InsertFirst(50);
        obj.InsertFirst(40);
        obj.InsertFirst(30);
        obj.InsertFirst(20);
        obj.InsertFirst(10);
        
        obj.Display();
        iRet = obj.Count();
        System.out.println("The Node count is : "+iRet);

        iRet = obj.SearchFirstOcc(30);
        System.out.println("First occurance is : "+iRet);
    }
}