//Question -40.) Seprate each digit of a number and print it on the new line

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.println(n%10);
           n=n/10;
       }


    }
}