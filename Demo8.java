//Question 38.) Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43

import java.util.Scanner;
public class Demo8 {
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
        System.out.println("answer :"+sum);
    }
}