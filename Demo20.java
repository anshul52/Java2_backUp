//Question 49.) Print hello until user gives wrong input using do while
import java.util.Scanner;
public class Demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int a;
        do
        {
            System.out.println("hello");
            a= sc.nextInt( );
        }while (a==i);
    }
}
