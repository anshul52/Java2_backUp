//Ques 43.) Accept a number and print its reverse
import java.util.Scanner;
public class Demo13 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
         int a=sc.nextInt();
         int reverseNum =0;
      while(a!=0) {
          int remainder= a%10;
          reverseNum = ( reverseNum*10 )+remainder;
          a=a/10;
      }
        System.out.println("reversed number is -->"+ reverseNum);
    }

}
