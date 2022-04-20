package edu.tamu.cs;

/**
 * Driver class for CommissionEmployee class
 */
public class CommissionEmployeeTest {
    /**
     * Main method to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
            "Sue", "Jones", "222-22-2222", 10000, 0.06
        );

        System.out.println(
            "Employee information obtained by accessor methods:"
        );
        System.out.printf("\n%s %s\n", "First name is ",
            employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is",
            employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is",
            employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is",
            employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is",
            employee.getCommissionRate());

        employee.setGrossSales(5000);
        employee.setCommissionRate(0.01);

        System.out.printf("\n%s:\n\n%s\n",
            "Updated employee information obtained by toString", employee);
    }
}