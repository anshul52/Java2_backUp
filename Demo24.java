//Question 54.)Choice calculator (using switch)
import java.util.Scanner;
public class Demo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for addition \nPress 2 for substraction \nPress 3 for Multiply \nPress 4 for Division\n Press 0 for exit");
        int n =sc.nextInt();
        int num1,num2;
        double res=0;
        switch (n){
            case 1 ->{
                System.out.println("Enter 2 numbers - ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                res = num1 + num2;
                System.out.println("Addition of "+num1+" + "+num2+" = "+res);
            }
            case 2->{
                System.out.println("Enter 2 numbers - ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                res= num1 - num2;
                System.out.println("Substraction of "+num1+" - "+num2+" = "+res);
            }
            case 3->{
                System.out.println("Enter 2 numbers - ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                res= num1*num2;
                System.out.println("Multiplication of "+num1+" * "+num2+" = "+res);
            }
            case 4->{
                System.out.println("Enter 2 numbers - ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                res=num1/num2;
                System.out.println("Division of "+num1+" / "+num2+" = "+res);
            }

            default -> {
                System.out.println("Wrong Input");
            }
        }
    }
}


