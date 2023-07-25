//70- Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21...
public class Demo40 {
    public static void main(String[] args) {
        int n = 10;
        int f = 0, s = 1;
        System.out.println(f + "\n" + s);
        for (int i = 2; i <= n; i++) {
            int sum = f + s;
            System.out.println(sum + " ");
            f = s;
            s = sum;
        }
    }
}
