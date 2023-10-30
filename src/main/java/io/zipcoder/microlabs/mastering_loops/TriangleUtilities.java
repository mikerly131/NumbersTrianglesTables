package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            triangle.append(getRow(i));
            triangle.append("\n");
        }
        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder rows = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            rows.append("*");
        }
        return rows.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
