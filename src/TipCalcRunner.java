import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalcRunner {
    public static void main(String [] args) {
        DecimalFormat formatter = new DecimalFormat("#,##");
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, welcome to the tip calculator!");

        System.out.println("How many people are dinning?");
        int people = scan.nextInt();

        System.out.println("What is the tip?");
        int tip = scan.nextInt();

        TipCalc calc = new TipCalc(people,tip);

        System.out.println("Enter a cost (Press -1 when done): ");

        }
    }
}

