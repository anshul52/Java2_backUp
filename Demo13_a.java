//Q 43_a.)Print digits of a number
//      --Approach1  ->String string_number = Integer.toString(number);
//      --Approach2  ->BreakInteger
import java.util.Scanner;

public class Demo13_a {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int a=sc.nextInt();
        int count = (int)Math.log10(a)+1;
        int num = (int)Math.pow(10,count-1);

        while(num!=0){   //approach2
            int div = a/num;
            int digit = div%10;
            System.out.println("-->"+digit);
            num /=10;
        }
    }
}
