package dia07.LAB04;

public class Payroll {
    private int totalHours;
    private int totalSales;
    private double totalPay;

    public void payEmployees(Employee[] emps) {
        for (Employee emp : emps) {
            totalPay += emp.calculatePay();
            emp.printPaycheck();
        }
    }

    public void calculateBonus(Employee[] emps){
        for (int i = 0; i < emps.length; i++) {
            Employee emp = emps[i];
            System.out.println("Pay bonus to " + emp.getLastName() + ", " + emp.getFirstName() + " $" + emp.calculateBonus());
        }
    }

    public void recordEmployeeInfo(CommissionedEmployee emp) {
        totalSales += emp.getSales();
    }

    public void recordEmployeeInfo(HourlyEmployee emp) {
        totalHours += emp.getHours();
    }

    public void printReport() {
        System.out.println("Payroll Report:");
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Total Paid: $" + totalPay);
    }
}
