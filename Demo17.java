///Ques 47.) [Accept a number and check if it is a Harshad number]
//      Harshad number is a number or an integer which is completely divisible by sum of  its digits.
//      Ex - 24 = Sum of 2+4 = 6 & 24%6 = 0
import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        while(a!=0) {
            int remainder= a%10;
            sum = sum +remainder;
            a=a/10;
        }
        int ans = temp%sum;
        if(ans==0) {
            System.out.println("harshad number");
        }
        else {
            System.out.println("not a harshad number");
        }
    }
}
