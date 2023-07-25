//53--Accept an english alphabet from user and check if it is a consonent or a vowel (using switch statement)
import java.util.Scanner;
public class Demo23a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a alphabet : ");
        char  n = sc.nextLine().charAt(0);
        System.out.println(n);
        switch (n)
        {
            case 97 -> System.out.println("vowel");
            case 101-> System.out.println("vowel");
            case 105-> System.out.println("vowel");
            case 111-> System.out.println("vowel");
            case 117-> System.out.println("vowel");
            default -> System.out.println("consonent");
        }
    }
}
