package white_boards.matrixTransposal;

/*
https://leetcode.com/problems/transpose-matrix/

Given a matrix, return the transposed matrix.
Flip the matrix over its diagonal, switch the row and column indices.
Take in matrix with dimensions of row*column.
Initialize a new matrix with dimensions of column*row.

Complexity:
Time: O(M*N) : M&N are # of rows and columns
Space: O(M*N) : Space created by new matrix
* */

public class MatrixTransposal {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length,
                column = matrix[0].length;

        int[][] solution = new int[column][row];
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++) {
                solution[c][r] = matrix[r][c];
            }
            return solution;
    }
}
