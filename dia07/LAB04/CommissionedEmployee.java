package dia07.LAB04;

public class CommissionedEmployee extends Employee {
    private double commission;
    private int units;

    public CommissionedEmployee(String firstName, String lastName, double wage, double commission) {
        super(firstName, lastName, wage);
        this.commission = commission;
    }

    public double calculateBonus(){
        return 100.00 * getSales();
    }

    public double calculatePay() {
        return getWage() + (commission * units);
    }

    public void addSales(int units) {
        this.units += units;
    }

    public int getSales() {
        return units;
    }

    public void resetSales() {
        units = 0;
    }
}
