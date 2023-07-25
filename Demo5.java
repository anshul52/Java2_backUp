//Question 35.)Print the sum of all even & odd numbers in a range seperately.
public class Demo5 {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int n = 10;
        if (n % 2 == 0) {
            for (int i = 1; i < n; i++) {
                if (n % 2 == 0) {
                    sumEven += 2;
                    System.out.println(sumEven);
                } else {
                    sumOdd += 2;
                    System.out.println(sumOdd);
                }
            }
        }
    }
}
