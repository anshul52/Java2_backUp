//Question 39- Accept a number and check if it a perfect number or not.
//      A number whose sum of factors(excluding number itself)  = Number
//      Ex -  6 = 1, 2, 3 = 6
import java.util.Scanner;
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<n;i++)  {
            if (n%i==0) {
                sum=sum +i;
                System.out.println(i);
            }
        }
        //System.out.println("answer :"+sum);
        if(sum==n) {
            System.out.println(n+" is a perfect number");
        }
        else {
            System.out.println("not a perfect number");
        }
    }
}