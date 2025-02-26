package dia07.LAB04;

public class PayrollDriver {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        CommissionedEmployee emp1 = new CommissionedEmployee("Mr.", "Sales", 25000.00, 1000.00);
        CommissionedEmployee emp2 = new CommissionedEmployee("Ms.", "Sales", 25000.00, 1000.00);
        emp1.addSales(7);
        emp2.addSales(5);

        HourlyEmployee emp3 = new HourlyEmployee("Mr.", "Minimum Wage", 6.50);
        HourlyEmployee emp4 = new HourlyEmployee("Ms.", "Minimum Wage", 6.50);
        emp3.addHours(40);
        emp4.addHours(46);

        payroll.recordEmployeeInfo(emp1);
        payroll.recordEmployeeInfo(emp2);
        payroll.recordEmployeeInfo(emp3);
        payroll.recordEmployeeInfo(emp4);

        Employee[] emps = {emp1, emp2, emp3, emp4};
        payroll.payEmployees(emps);
        payroll.printReport();
    }
}
