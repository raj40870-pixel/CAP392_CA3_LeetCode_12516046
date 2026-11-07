/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 06: LeetCode 509 - Fibonacci Number
 * Level: Easy
 * Unit: I, II
 * Topics: methods, recursion or loops
 * LeetCode URL: https://leetcode.com/problems/fibonacci-number/
 *
 * Submission Metrics:
 * - Status: Accepted (Passed all test cases)
 * - Runtime: 0 ms (Beats 100.00% of Java submissions)
 * - Language: Java
 *
 * Approach:
 * - In accordance with Unit I and II syllabus (Loops and Methods):
 * - If n is 0 or 1, the base values are returned directly (return n).
 * - For n >= 2, we use an iterative approach using two tracking variables (a = 0, b = 1).
 * - A standard for loop runs from 2 up to n, computing the next Fibonacci number as c = a + b,
 *   then updating a = b and b = c.
 * - This avoids the exponential O(2^n) time overhead of naive recursion and runs in linear time.
 *
 * Complexity Analysis:
 * - Time Complexity: O(n), single linear for-loop from 2 to n.
 * - Space Complexity: O(1) auxiliary space (uses only 3 scalar variables: a, b, c).
 */

class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        
        return b;
    }
}
