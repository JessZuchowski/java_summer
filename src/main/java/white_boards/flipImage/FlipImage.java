package white_boards.flipImage;

// https://leetcode.com/problems/flipping-an-image/
/*
Given a binary matrix, ,flip the image horizontally, then invert it.
Return the resulting image.

In each row, the ith value from the left is equal to the inverse of the ith value from the right.

Complexity:
Time: O(N), n = # of elements in matrix
Space: O(1)
*/

public class FlipImage {
    //input and output are matrices
    public int[][]  flipThenInvertMatrix(int[][] matrix) {
        //declare int as center of array
        int center = matrix[0].length;
        //iterate over each row in matrix
        for (int[] row : matrix)
            //iterate over first half of indices (add 1 to always include center)
            for (int i = 0; i < (center + 1) / 2; i++) {
                //declare temporary variable at index (^1 to keep binary)
                int temp = row[i] ^ 1;
                //set index to beginning
                row[i] = row[center - 1 - i] ^ 1;
                //set beginning to temp
                row[center - 1 - i] = temp;
            }
        return matrix;
    }
}
