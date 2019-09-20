package white_boards.sortedArraySquares;

/*
https://leetcode.com/problems/squares-of-a-sorted-array/

Given an array of integers sorted in non-decreasing order,
return an array of the squares of each int also sorted.
* */

import java.util.Arrays;

public class SortedArraySquares {
    public int[] sortedSquares(int[] array) {
        int n = array.length;
        //declare new array of ints
        int[] solution = new int[n];
        //square each int
        for (int i = 0; i < n; i++)
            solution[i] = array[i] * array[i];

        //sort new array
        Arrays.sort(solution);
        return solution;
        }
}
