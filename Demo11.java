//Question 41.)  Sum of digits of a number, 936 = 18
import java.util.Scanner;
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<=n;i++)  {
            int digit= n%10;
                sum=sum +digit;
                n=n/10;
        }
        System.out.println(sum );
    }
}
