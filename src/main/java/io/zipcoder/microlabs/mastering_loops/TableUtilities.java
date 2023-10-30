package io.zipcoder.microlabs.mastering_loops;

import static io.zipcoder.microlabs.mastering_loops.NumberUtilities.getSquareNumbers;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5); }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        // going to need to produce a square of size tableSize * tableSize;
        StringBuilder multTable = new StringBuilder();
        // loop to produce columns

        for (int i = 1; i <= tableSize; i++) {
            // loop to fill out row
            for (int j = 1; j <= tableSize; j++) {
                 multTable.append(String.format("%3d |", i * j));
            }
            // new ling
            multTable.append("\n");
        }

        return multTable.toString();
    }
}
