package edu.tamu.cs;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    /**
     * Base salary of employee
     */
    private double baseSalary;

    /**
     * Constructor that takes 
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     * @param grossSales
     * @param commissionRate
     * @param baseSalary
     */
    public BasePlusCommissionEmployee(String firstName, String lastName,
        String socialSecurityNumber, double grossSales,
        double commissionRate, double baseSalary) {

        super(firstName, lastName, socialSecurityNumber,
            grossSales, commissionRate);

        if(baseSalary < 0.0)
            throw new IllegalArgumentException(
                "Base Salary must be >= 0.0"
            );
        
        this.baseSalary = baseSalary;
    }

    /**
     * Modifier method for base salary of this employee
     * @param baseSalary base salary of this employee
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Accessor method for base salary of this employee
     * @return Base salary of this employee
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Calculate total earnings made by this employee
     * @return Total earnings made by this employee
     */
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    /**
     * Create String representation of this object
     * @return String representation of this object
     */
    @Override
    public String toString() {
        return String.format(
            "%s: %s\n%s: %.2f", "base-salaried",
            super.toString(), "base salary", getBaseSalary()
        );
    }
}
