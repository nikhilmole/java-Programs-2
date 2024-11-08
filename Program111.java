import java.util.*;


class Program111
{
    static void ExamSchedule(char ch)
    {
        switch(ch)
        {
            case 'A':
                System.out.println("Exam of division A at 7 AM");
                break;
        
            case 'B':
                System.out.println("Exam of division B at 8 AM");
                break;

            case 'C':
                System.out.println("Exam of division C at 9 AM");
                break;

            case 'D':
                System.out.println("Exam of division D at 10 AM");
                break;
        
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    public static void main(String[] Argv)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Divivsion :");
        String str = sobj.nextLine();

        char ch = str.charAt(0);

        ExamSchedule(ch);
    }
}