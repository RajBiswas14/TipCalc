public class TipCalc {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalc(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }
    public void addfood(double cost) {
        totalBillBeforeTip += cost;
    }
    public double tipAmount() {
        return totalBillBeforeTip * (tipPercentage / 100.0);
    }
    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }
    public double PerPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }
    public double PerPersonTotalCost() {
        return totalBill() / numPeople;
    }
}
