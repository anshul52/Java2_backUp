//Que-51 --  Write a program to print the sum of negative numbers,
//        sum of positive even numbers and the sum of positive odd numbers
//       from a list of numbers (N) entered by the user.
//       The list terminates when the user enters a zero.
import java.util.Scanner;
//Que-51
public class  Demo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        int sumNeg = 0 , sumPosEven = 0 , sumPosOdd = 0;
        System.out.println("enter the number : ");
        do {
             n = sc.nextInt();
            if (n < 0)
                sumNeg += n;
            else if (n % 2 == 0)
                sumPosEven += n;
            else
                sumPosOdd += n;

        }while (n != 0);
        System.out.println(" Negative = "+sumNeg + "\n Sum Pos Even = " +sumPosEven + "\n Sum Pos Odd = " +sumPosOdd);
    }

}