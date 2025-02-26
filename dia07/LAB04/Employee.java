package dia07.LAB04;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private double wage;

    public Employee(String firstName, String lastName, double wage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract double calculatePay();

    public void printPaycheck() {
        String fullName = lastName + ", " + firstName;
        System.out.println("Pay: " + fullName + " $" + calculatePay());
    }
}