package edu.tamu.cs;

public class BasePlusCommissionEmployee {
    /**
     * First name of employee
     */
    private final String firstName;
    /**
     * Last name of employee
     */
    private final String lastName;
    /**
     * Social security number of employee
     */
    private final String socialSecurityNumber;
    /**
     * Gross sales of employee
     */
    private double grossSales;
    /**
     * Commission rate for employee
     */
    private double commissionRate;
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
        if(grossSales < 0.0)
            throw new IllegalArgumentException(
                "Gross sales must be >= 0.0"
            );
        
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                "Commission rate must be > 0.0 and < 1.0"
            );
            
        if(baseSalary < 0.0)
            throw new IllegalArgumentException(
                "Base Salary must be >= 0.0"
            );
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    /**
     * Accessor method for first name of this employee
     * @return first name of this employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Accessor method for last name of this employee
     * @return last name of this employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Accessor method for SSN of this employee
     * @return SSN of this employee
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Modifier method for gross sales of this employee
     * @param grossSales Gross sales of this employee
     */
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException(
                "Gross sales must be >= 0.0"
            );
        
        this.grossSales = grossSales;
    }

    /**
     * Accessor method for gross sales of this employee
     * @return Gross sales of this employee
     */
    public double getGrossSales() {
        return grossSales;
    }

    /**
     * Modifier method for commission rate for this employee
     * @param commissionRate Commission rate for this employee
     */
    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                "Commission rate must be > 0.0 and < 1.0"
            );

        this.commissionRate = commissionRate;
    }

    /**
     * Accessor method for commission rate for this employee
     * @return Commission rate for this employee
     */
    public double getCommissionRate() {
        return commissionRate;
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
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    /**
     * Create String representation of this object
     * @return String representation of this object
     */
    @Override
    public String toString() {
        return String.format(
            "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "base-salaried commission employee", firstName, lastName,
            "social security number", socialSecurityNumber,
            "gross sales", grossSales, "Commission rate", commissionRate,
            "base salary", baseSalary
        );
    }
}
