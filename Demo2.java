//32- Take a number as input and print its table
//       5 * 1 = 5
//       5 * 2 = 10 ... up to 10 terms

import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i=1;i<=10;i++)
        {

            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}
