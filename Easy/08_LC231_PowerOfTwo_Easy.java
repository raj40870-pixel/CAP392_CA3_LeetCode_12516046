/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 08: LeetCode 231 - Power of Two
 * Level: Easy
 * Unit: I
 * Topics: operators, loops, conditionals
 * LeetCode URL: https://leetcode.com/problems/power-of-two/
 *
 * Submission Metrics:
 * - Status: Accepted (Passed all test cases)
 * - Runtime: 0 ms (Beats 100.00% of Java submissions)
 * - Language: Java
 *
 * Approach:
 * - In accordance with Unit I concepts (Operators, Loops, Conditionals):
 * - Conditionals: Any number n <= 0 cannot be a power of two, so return false immediately.
 * - Loops & Operators: While n is divisible by 2 (i.e. n % 2 == 0), repeatedly divide n by 2.
 * - If the final reduced value equals 1, then n was indeed an exact power of two (return true);
 *   otherwise, it contained other prime factors (return false).
 *
 * Complexity Analysis:
 * - Time Complexity: O(log n), since n is halved in each iteration of the while loop (0 ms runtime).
 * - Space Complexity: O(1) auxiliary space (no additional memory used).
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        // Numbers less than or equal to 0 cannot be powers of two
        if (n <= 0) {
            return false;
        }
        
        // Repeatedly divide by 2 while n is evenly divisible
        while (n % 2 == 0) {
            n /= 2;
        }
        
        // If reduced to 1, it is a power of two
        return n == 1;
    }
}
