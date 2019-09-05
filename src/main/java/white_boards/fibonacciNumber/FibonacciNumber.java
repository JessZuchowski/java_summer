package white_boards.fibonacciNumber;

/*
https://leetcode.com/problems/fibonacci-number/

Given n, calculate F(n).
F(n) = F(n - 1) + F(n - 2) for n > 1.
* */

public class FibonacciNumber {

    //recursive solution
    /*
    Complexity:
    Time: O(2^n)
    Space: O(n)
    */
    public int recursive(int n) {
        //base case: return n if <= 1
        if (n <= 1) {
            return n;
        }
        //else return result of of two previous #s being added to each other
        return recursive(n - 1) + recursive(n - 2);
    }

    //iterative solution
    /*
    Complexity:
    Time: O(n)
    Space: O(1)
    */
    public int iterative(int n) {
        //base cases
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        //initialize current and previous two values
        int current = 0;
        int prev1 = 1;
        int prev2 = 1;

        //iterate starting at 3
        for (int i = 3; i <= n; i++) {
            //set current to value being computed
            current = prev1 + prev2;
            //set prev2 to n - 1
            prev2 = prev1;
            //set prev1 to current, reaching n + 1 exits loop and returns current
            prev1 = current;
        }
        return current;
    }
}
