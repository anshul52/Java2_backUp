//Ques.46)   (strong number)  (Sum of factorial of each digit)
import java.util.Scanner;
public class Demo16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number : ");
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        //int fact =0;
        while(a!=0) {
            int remainder= a%10;
            int i=1;
            int fact =1;
            while(i<=remainder) {
                fact=fact*i;
                i++;
            }
            sum = sum+fact;
            a=a/10;
        }
        if(sum==temp) {
            System.out.println("strong number");
        }
        else {
            System.out.println("not a strong number");
        }
    }
}
