package white_boards.arrayForm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
https://leetcode.com/problems/add-to-array-form-of-integer/
Given an integer in array form,
return the array form of int + K
* */
public class ArrayForm {

    public List<Integer> addToArray(int[] array, int K) {
        int num = array.length;
        int current = K;
        List<Integer> answer = new ArrayList<>();

        int i = num;
        while (--i >= 0 || current > 0) {
            if (i >= 0)
                current += array[i];
            answer.add(current % 10);
            current /= 10;
        }

        Collections.reverse(answer);
        return answer;
        
    }
}
