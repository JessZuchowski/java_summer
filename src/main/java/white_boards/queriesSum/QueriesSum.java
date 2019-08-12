package white_boards.queriesSum;

/*
https://leetcode.com/problems/sum-of-even-numbers-after-queries/

Given an input array of integers and a matrix of queries
(each query containing two ints, a number to add to an index of the input array)
add even values of new array and return the answer to all queries.

Example:
Input: array = [1, 2, 3, 4], queries = [[1, 0], [-3, 1], [-4, 0], [2,3]]
Steps:
    1. add 1 to array[0], new array is [2, 2, 3, 4], sum of evens is 8.
    2. add -3 to array[1], new array is [2, -1, 3, 4], sum of evens is 6.
    3. add -4 to array[0], new array is [-2, -1, 3, 4], sum of evens is 2.
    4. add 2 to array[3], new array is [-2, -1, 3, 6], sum of evens is 4.
Output: [8, 6, 2, 4]

* */
public class QueriesSum {
    //return an array, take in an array and a matrix
    public int[] sumEvenQuery(int[] array, int[][] queries) {
        //declare sum, set to 0
        int sum = 0;
        //for each int in the array
        for (int x: array)
            //if the int is even
            if (x % 2 == 0)
                //add ints
                sum +=x;

            //answer will be an array as long as the number of queries
            int[] answer = new int[queries.length];

            //iterate through queries
            for (int i = 0; i < queries.length; i++) {
                //value to add to array is at index 0 of queries
                int value = queries[i][0],
                        //index of array to add to is at index 1 of queries
                        index = queries[i][1];
                //if int is even, remove it from the sum
                if (array[index] % 2 == 0) sum -= array[index];
                //and add it back along with the added query value
                array[index] += value;
                if (array[index] % 2 == 0) sum += array[index];
                answer[i] = sum;
            }
            return answer;
    }
}
