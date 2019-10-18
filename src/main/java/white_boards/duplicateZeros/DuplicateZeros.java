package white_boards.duplicateZeros;

/*
https://leetcode.com/problems/duplicate-zeros/

Given a fixed length array of ints, duplicate each 0 and shift elements to right.
Modify array in place, return array of same length as input.
* */
public class DuplicateZeros {

    public void dupZeros(int[] array) {
        //declare # of potential duplicates and array length
        int potentialDups = 0;
        int arrLength = array.length - 1;

        //account for # of 0s and keep array the same length
        for (int left = 0; left <= arrLength - potentialDups; left++) {

            //count 0s
            if (array[left] == 0) {
                //if at end of array, copy without duplicating
                if ( left == arrLength - potentialDups) {
                    array[arrLength] = 0;
                    arrLength -= 1;
                    break;
                }
                potentialDups++;
            }
        }
        //start from last index
        int lastIndex = arrLength - potentialDups;

        //copy a 0 twice, a non-zero once
        for (int i = lastIndex; i >= 0; i--) {
            if (array[i] == 0) {
                array[i + potentialDups] = 0;
                potentialDups--;
                array[i + potentialDups] = 0;
            } else {
                array[i + potentialDups] = array[i];
            }
        }
    }
}
