package com.company;

public class Main {

    public static int noOfRows;
    public static int noOfCols;

    // Find the number of covered side
    // for mat[i][j].
    static int numOfNeighbour(int[][] grid,
                              int i, int j) {

        int count = 0;
        // UP
        if (i > 0 && grid[i - 1][j] == 1)
            count++;

        // LEFT
        if (j > 0 && grid[i][j - 1] == 1)
            count++;

        // DOWN
        if (i < grid.length - 1 && grid[i + 1][j] == 1)
            count++;

        // RIGHT
        if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
            count++;

        return count;
    }

    public static int findPerimeter(int[][] grid) {
        int perimeter = 0;
        // Traversing the matrix and
        // finding ones to calculate
        // their contribution.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += (4 -
                            numOfNeighbour(grid, i, j));
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        int[][] data = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        noOfRows = data.length;
        noOfCols = data[0].length;
        System.out.println(findPerimeter(data));
    }
}
