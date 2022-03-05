package edu.tamu.cs;

/**
 * Class to store grades
 */
public class GradeBook {
    /**
     * Name of course
     */
    private String courseName;
    /**
     * 2D Array of student grades
     */
    private int[][] grades;

    /**
     * Constructor
     * @param courseName name of the course
     * @param grades list of grades
     */
    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    /**
     * Set the course name
     * @param courseName name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Get the course name
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Perform operations on the data
     */
    public void processGrades() {
        outputGrades();

        // System.out.printf("\nClass average is %.2f\n", getAverage());
        System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n",
            getMinimum(), getMaximum());
        
        outputBarChart();
    }

    /**
     * Calculate the minimum value from a list
     * @return the least value in that list
     */
    public int getMinimum() {
        int lowGrade = grades[0][0];

        for(int[] studentGrades : grades) {
            for(int grade : studentGrades) {
                if(grade < lowGrade)
                lowGrade = grade;
            }
        }

        return lowGrade;
    }

    /**
     * Calculate the maximum number from a list
     * @return the largest value in the list
     */
    public int getMaximum() {
        int highGrade = grades[0][0];

        for(int[] studentGrades : grades) {
            for(int grade : studentGrades) {
                if(grade > highGrade)
                highGrade = grade;
            }
        }

        return highGrade;
    }

    /**
     * Calculate the average of all the values in a l ist
     * @return the average value in the list
     */
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for(int grade : setOfGrades)
            total += grade;
        
        return (double) total / setOfGrades.length;
    }

    /**
     * Output a bar chart for each of the values in the lst
     */
    public void outputBarChart() {
        System.out.println("Grade distribution:");

        int[] frequency = new int[11];
        for(int[] studentGrades : grades)
            for(int grade : studentGrades)
                ++frequency[grade / 10];
        
        for(int count = 0; count < frequency.length; count++) {
            if(count == 10)
                System.out.printf("%5d:    ", 100);
            else
                System.out.printf("%02d-%02d:    ",
                    count * 10, count * 10 + 9);
            
            for(int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");
            
            System.out.println();
        }
    }

    /**
     * Output the grades in a good format
     */
    public void outputGrades() {
        System.out.printf("The grades are:\n\n");
        System.out.print("            ");
        
        for(int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d   ",
                test + 1);
        
        System.out.println("Average");

        for(int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for(int test : grades[student])
                System.out.printf("%8d", test);
            
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f\n", average);
        }
    }
}