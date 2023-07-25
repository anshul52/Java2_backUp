import java.util.Scanner;

//Ques 48.) [Automorphic number]
// (an integer whose square ends with the given integer)
// 5 = 25 = 625 = 390625
public class Demo18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int a=sc.nextInt();
        int temp =a;
        int square = a*a;
        int count=0;
        while (a!=0) {
            count++;
            a=a/10;
        }
        //determine the digit of the variable
        int lastDigit = (int) (square % (Math.pow(10,count)));

        System.out.println(lastDigit==temp ? "Automorphic" : "not Automorphic");

    }
    
}
