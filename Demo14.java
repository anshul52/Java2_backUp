//Ques 44.)check if the number is a pallindromic number or not
import java.util.Scanner;
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int a=sc.nextInt();
        int temp=a;
        int reverseNum=0;
        while(a!=0) {
            int remainder= a%10;
            reverseNum = ( reverseNum*10 )+remainder;
            a=a/10;
        }
        if(reverseNum==temp) {
            System.out.println("pallindrom number");

        }
        else {
            System.out.println("not a pallindromic number");
        }
    }

}
