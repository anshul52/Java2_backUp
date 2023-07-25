//Ques 45.)[Accept a number and check if it is a armstrong number]
// (Sum of cube of all digits will be equal to origional number)
//       Ex - 407 = 64 + 0 + 343 = 407
//              153 = 1 + 125 + 27 = 153
import java.math.*;
import java.util.Scanner;
public class Demo15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        int cube =0;
        while(a!=0) {
            int remainder= a%10;
            cube = (remainder * remainder * remainder);
            sum = sum+cube;
            a=a/10;
        }
        if(sum==temp) {
            System.out.println("armstrong number");

        }
        else {
            System.out.println("not a armstrong number");
        }
    }

}
