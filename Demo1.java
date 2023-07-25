//31- Reverse for loop. Print n to 1.
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n =sc.nextInt();
        for(int i = n; i>0 ;i--) //i>=0 ,  i=i*10
        {
            System.out.println(i);
        }
    }
}
