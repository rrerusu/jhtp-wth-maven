package edu.tamu.cs;

/**
 * Enum type with constructor and explicit instance fields
 * and accessors for these methods
 */
public enum Book {
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2015"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    /**
     * Title of book
     */
    private final String title;
    /**
     * Year that book was copywritten in
     */
    private final String copyrightYear;

    /**
     * Constructor that initializes a book with given title and copyright year
     * @param title TItle of the book
     * @param copyrightYear Copyright year of the book
     */
    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    /**
     * Get the title of a book
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Get copyright year of a book
     * @return copyright year of the book
     */
    public String getCopyrightYear() {
        return copyrightYear;
    }
}
