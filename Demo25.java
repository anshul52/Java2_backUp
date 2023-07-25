//Question 55)- Restuarent
import java .util.Scanner;
public class Demo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainCh;
        int amt = 0;
        do {
            System.out.println("choose an option");
            System.out.println("1 - NorthIndian\n2 - South Indian\n3 - Chinies\n0 - Exit");
            mainCh = sc.nextInt();
            switch (mainCh) {
                case 1 -> {
                    System.out.println("choose an item");
                    System.out.println("1 - Daal\n2  - Paneer\n3  - Chawal");
                    int subCH = sc.nextInt();
                    switch (subCH){
                        case 1 -> {
                            System.out.println("you ordered daal");
                            amt +=80;
                        }
                        case 2 -> {
                            System.out.println("Paneer order ho gaya");
                            amt +=120;
                        }
                        case 3 -> {
                            System.out.println("Chawal order ho gaya");
                            amt +=50;
                        }
                    }
                }
                case 2 ->{
                    System.out.println("choose an item");
                    System.out.println("1 - Vada\n2  - Dosa\n3  - Idli");
                    int subCH = sc.nextInt();
                    switch (subCH){
                        case 1 -> {
                            System.out.println("you ordered Vada");
                            amt +=80;
                        }
                        case 2 -> {
                            System.out.println("Dosa order ho gaya");
                            amt +=100;
                        }
                        case 3 -> {
                            System.out.println("Idli order ho gaya");
                            amt +=50;
                        }
                    }
                }
                case 3 ->{
                    System.out.println("choose an item");
                    System.out.println("1 - Momos\n2  - ChaomeenC\n3  - Manchurian");
                    int subCH = sc.nextInt();
                    switch (subCH){
                        case 1 -> {
                            System.out.println("you ordered Momos");
                            amt +=40;
                        }
                        case 2 -> {
                            System.out.println("Chaomeen order ho gaya");
                            amt +=40;
                        }
                        case 3 -> {
                            System.out.println("Manchurian order ho gaya");
                            amt +=60;
                        }
                    }
                }
            }

        } while (mainCh != 0);
        System.out.println("Total amt = "+ amt);
    }
}