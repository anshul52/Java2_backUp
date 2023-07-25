//Question -42.)Check if the number is Prime or not.   ->(optimize solution)<-

import java.util.Scanner;

public class Demo12 {
    public static  boolean isPrime(int n){
        if(n<=1) return false;
        if(n == 2) return true;
        if(n%2==0) return false;
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i == 0) return false;
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n)); // ex =999999937
    }
}
