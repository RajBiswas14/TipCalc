import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalcRunner {
    public static void main(String [] args) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, welcome to the tip calculator!");

        System.out.println("How many people are dinning?");
        int people = scan.nextInt();

        System.out.println("What is the tip?");
        int tip = scan.nextInt();

        TipCalc calc = new TipCalc(people,tip);

        System.out.println("Enter a cost (Press -1 when done): ");
        double cost = scan.nextDouble();

        while (cost != -1) {
            calc.addfood(cost);
            System.out.print("Enter a cost (Press -1 when done): ");
            cost = scan.nextDouble();
        }


        String formatTotalCost = formatter.format(calc.getTotalBillBeforeTip());
        String formatTip = formatter.format(calc.getTipPercentage());
        String formatTotalTip = formatter.format(calc.tipAmount());
        String formatTipBill = formatter.format(calc.totalBill());
        String formatPersonCost = formatter.format(calc.PerPersonTotalCost());
        String formatPersonTip = formatter.format(calc.PerPersonCostBeforeTip());
        String formatPersonTotal = formatter.format(calc.PerPersonTotalCost());

        System.out.println("Total bill before tip: " + formatTotalCost);
        System.out.println("Tip percentage: " + formatTip);
        System.out.println("Total tip: " + formatTotalTip);
        System.out.println("Total bill with the tip: " + formatTipBill);
        System.out.println("Cost per person without tip: " + formatPersonCost);
        System.out.println("The tip per person: " + formatPersonTip);
        System.out.println("Total cost per person: " + formatPersonTotal);

        }
    }


