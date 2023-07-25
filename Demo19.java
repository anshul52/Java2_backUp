//question 26.)

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ISBN = sc.nextLong();
        long sum = 0;
        for (int i = 10; i >= 1; i--) {
            int rem = (int) (ISBN % 10);
            sum = sum + rem * i;
            ISBN = ISBN / 10;
        }
        System.out.println(sum % 11 == 0 ? "legal" : "illegal");
    }
}
