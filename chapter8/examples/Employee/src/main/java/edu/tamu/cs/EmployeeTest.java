package edu.tamu.cs;

/**
 * Test Employee and Date classes
 */
public class EmployeeTest {
    /**
     * Main class to run code
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }
}