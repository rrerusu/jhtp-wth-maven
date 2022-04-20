package edu.tamu.cs;

public class Shape {
    /**
     * Number of faces this shape has
     */
    private int faces;
    /**
     * Number of sides this shape has
     */
    private int sides;
    /**
     * Number of vertices this shape has
     */
    private int vertices;

    /**
     * Constructor that takes all values as parameters
     * @param numFaces Number of faces this shape has
     * @param numSides number of sides this shape has
     * @param numVertices Number of vertices this shape has
     */
    public Shape(int numFaces, int numSides, int numVertices) {
        faces = numFaces;
        sides = numSides;
        vertices = numVertices;
    }

    /**
     * Accessor method for number of faces
     * @return Number of faces
     */
    public int getFaces() {
        return faces;
    }

    /**
     * Accessor method for number of sides
     * @return Number of sides
     */
    public int getSides() {
        return sides;
    }

    /**
     * Accessor method for number of vertices
     * @return Number of vertices
     */
    public int getVertices() {
        return vertices;
    }

    /**
     * Modifier method for number of faces
     * @param numFaces Number of faces
     */
    public void setFaces(int numFaces) {
        faces = numFaces;
    }

    /**
     * Modifier method for number of sides
     * @param numSides Number of sides
     */
    public void setSides(int numSides) {
        sides = numSides;
    }

    /**
     * Modifier method for number of vertices
     * @param numVertices Number of vertices
     */
    public void setVertices(int numVertices) {
        vertices = numVertices;
    }

    /**
     * String representation of this object
     * @return String representation of this object
     */
    @Override
    public String toString() {
        return String.format("Faces: %d\nSides%d\nVertices: %d\n",
            getFaces(), getSides(), getVertices());
    }
}