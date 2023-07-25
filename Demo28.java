//Question 58.)
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E

import java.util.Scanner;
public class Demo28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j=0;j<i;j++){
                char ch = (char) (65 + j); //ASCII no. trick
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

}


