//68- Take 2 numbers as inputs and find their HCF
import java.util.Scanner;
public class Demo38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i=Math.min(a,b) ; i>1 ;i--)
        {
            if (a%i ==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
