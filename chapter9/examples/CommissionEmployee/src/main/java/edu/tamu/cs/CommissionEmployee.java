package edu.tamu.cs;

public class CommissionEmployee extends Object {
    /**
     * Employee first name
     */
    private final String firstName;
    /**
     * Employee last name
     */
    private final String lastName;
    /**
     * Employee social security number
     */
    private final String socialSecurityNumber;
    /**
     * Employee gross sales
     */
    private double grossSales;
    /**
     * Employee commission rate
     */
    public double commissionRate;

    /**
     * Constructor that accepts all values for our employee
     * @param firstName Employee first name
     * @param lastName Employee last name
     * @param socialSecurityNumber Employee social security number
     * @param grossSales Employee gross Sales
     * @param commissionRate Employee Commission Rate
     */
    public CommissionEmployee(String firstName, String lastName,
        String socialSecurityNumber, double grossSales,
        double commissionRate) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException(
                "Gross sales must be >= 0.0"
            );

        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                "Commission rate must be > 0.0 and < 1.0"
            );
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    /**
     * Accessor method for first name
     * @return Employee first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Accessor method for last name
     * @return Employee last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Accessor method for social security number
     * @return Employee social security number
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Modifier method for gross sales
     * @param grossSales Employee gross sales
     */
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException(
                "Gross sales must be >= 0.0"
            );
        
        this.grossSales = grossSales;
    }

    /**
     * Accessor method for gross sales
     * @return Employee gross sales
     */
    public double getGrossSales() {
        return grossSales;
    }

    /**
     * Modifier method for commission rate
     * @param commissionRate Employee commission rate
     */
    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                "Commission rate must be > 0.0 and < 1.0"
            );
        
        this.commissionRate = commissionRate;
    }

    /**
     * Accessor method for commission rate
     * @return Employee commission rate
     */
    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * Calculate how much money this employee made
     * @return Employee earnings
     */
    public double earnings() {
        return commissionRate * grossSales;
    }

    /**
     * String representation of this Employee object
     * @return String representation of this Employee object
     */
    @Override
    public String toString() {
        return String.format(
            "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
            "commission employee", firstName, lastName,
            "social security number", socialSecurityNumber,
            "gross sales", grossSales,
            "commission rate", commissionRate
        );
    }
}