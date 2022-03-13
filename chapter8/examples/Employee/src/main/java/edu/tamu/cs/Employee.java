package edu.tamu.cs;

/**
 * Class to store employee information
 */
public class Employee {
    /**
     * First name of the employee
     */
    private String firstName;
    /**
     * Last name of the employee
     */
    private String lastName;
    /**
     * Employee birth date
     */
    private Date birthDate;
    /**
     * Date that employee was hired
     */
    private Date hireDate;

    /**
     * Costructor that takes all values
     * @param firstName First name of employee
     * @param lastName Last name of employee
     * @param birthDate Birth date of employee
     * @param hireDate Hire date of employee
     */
    public Employee(String firstName, String lastName, Date birthDate,
        Date hireDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.hireDate = hireDate;
    }

    /**
     * Create String representation of this Employee object
     * @return String representation of this Employee object
     */
    public String toString() {
        return String.format("%s, %s  Hired: %s  Birthday: %s",
            lastName, firstName, hireDate, birthDate);
    }
}