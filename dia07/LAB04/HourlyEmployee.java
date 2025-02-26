package dia07.LAB04;

public class HourlyEmployee extends Employee {
    private int hours;

    public HourlyEmployee(String firstName, String lastName, double wage) {
        super(firstName, lastName, wage);
    }

    public double calculatePay() {
        return getWage() * hours;
    }

    public void addHours(int hours) {
        this.hours += hours;
    }

    public int getHours() {
        return hours;
    }

    public void resetHours() {
        hours = 0;
    }
}