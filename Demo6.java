//Question36.) Print all the numbers which are either divisible by 3 or 5 in a range
public class Demo6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
