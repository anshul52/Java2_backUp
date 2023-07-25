//69- Find the LCM of two numbers
import java.util.Scanner;
public class Demo39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = Math.max(a, b); i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
