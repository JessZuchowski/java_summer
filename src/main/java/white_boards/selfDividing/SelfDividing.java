package white_boards.selfDividing;

/*
https://leetcode.com/problems/self-dividing-numbers/
Given a number bound, output a list of every possible
self-dividing number, including the bounds.
* */

import java.util.ArrayList;
import java.util.List;

public class SelfDividing {
    //take in two ints, return a list
    public List<Integer> selfDividingInts(int left, int right) {
    List<Integer> answer = new ArrayList<>();
    //test each int in the range and add to list
    for (int n = left; n <= right; n++) {
        if (selfDividing(n)) answer.add(n);
    }
    return answer;
    }
    //convert each int into char array, then back to int
    //to check for remainders
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }
}
