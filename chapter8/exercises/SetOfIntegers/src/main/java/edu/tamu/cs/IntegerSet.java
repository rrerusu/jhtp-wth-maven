package edu.tamu.cs;

public class IntegerSet {
    /**
     * Length of all IntegerSets
     */
    private static final int SET_LENGTH = 100;
    /**
     * List of booleans that represent which integers are in a list
     */
    private boolean[] setOfIntegers;

    /**
     * Default constructor
     */
    public IntegerSet() {
        setOfIntegers = new boolean[SET_LENGTH];
    }

    /**
     * Determine the set-theoretic union of 2 IntegerSet objects
     * @param set1 First IntegerSet object
     * @param set2 Second IntegerSet object
     * @return Set-theoretic union of 2 IntegerSet objects
     */
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet unionSet = new IntegerSet();

        for(int index = 0; index < SET_LENGTH; index++) {
            unionSet.getIntegerSet()[index] = set1.getIntegerSet()[index]
                || set2.getIntegerSet()[index];
        }

        return unionSet;
    }

    /**
     * Determine the set-theoretic intersection of 2 IntegerSet objects
     * @param set1 First IntegerSet object
     * @param set2 Second IntegerSet object
     * @return Set-theoretic intersection of 2 IntegerSet objects
     */
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet();

        for(int index = 0; index < SET_LENGTH; index++) {
            intersectionSet.getIntegerSet()[index] = set1.getIntegerSet()[index]
                && set2.getIntegerSet()[index];
        }

        return intersectionSet;
    }

    /**
     * Accessor method for boolean array representing set of integers
     * @return Boolean array representing set of integers
     */
    public boolean[] getIntegerSet() {
        return setOfIntegers;
    }

    /**
     * Add an element to this IntegerSet object
     * @param element Object that will be added to this IntegerSet object
     */
    public void insertElement(int element) {
        setOfIntegers[element] = true;
    }

    /**
     * Remove an element to this IntegerSet object
     * @param element Object that will be removed to this IntegerSet object
     */
    public void removeElement(int element) {
        setOfIntegers[element] = false;
    }

    /**
     * Modifier method for boolean array representing set of integers
     * @param setOfIntegers Boolean array representing set of integers
     */
    public void setIntegerSet(boolean[] setOfIntegers) {
        this.setOfIntegers = setOfIntegers;
    }

    
}