package edu.tamu.cs;

/**
 * Class to store employee information
 */
public class Employee {
    /**
     * Number of employees created
     */
    private static int count = 0;
    /**
     * First name of the employee
     */
    private String firstName;
    /**
     * Last name of the employee
     */
    private String lastName;
    // /**
    //  * Employee birth date
    //  */
    // private Date birthDate;
    // /**
    //  * Date that employee was hired
    //  */
    // private Date hireDate;

    /**
     * Costructor that takes all values
     * @param firstName First name of employee
     * @param lastName Last name of employee
     */
    //  * @param birthDate Birth date of employee
    //  * @param hireDate Hire date of employee
    //  */
    public Employee(String firstName, String lastName/*, Date birthDate,*/
        /*Date hireDate*/) {
            this.firstName = firstName;
            this.lastName = lastName;

            ++count;
            System.out.printf("Employees constructor: %s %s; count = %d\n",
                firstName, lastName, count);
            // this.birthDate = birthDate;
            // this.hireDate = hireDate;
    }

    /**
     * Accessor method for first name
     * @return Employee's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Accessor method for last name
     * @return Employee's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Accessor method for number of employees created
     * @return Number of employees created
     */
    public static int getCount() {
        return count;
    }

    // /**
    //  * Create String representation of this Employee object
    //  * @return String representation of this Employee object
    //  */
    // public String toString() {
    //     return String.format("%s, %s  Hired: %s  Birthday: %s",
    //         lastName, firstName, hireDate, birthDate);
    // }
}