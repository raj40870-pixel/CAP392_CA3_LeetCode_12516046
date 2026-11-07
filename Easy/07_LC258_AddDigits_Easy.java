/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 07: LeetCode 258 - Add Digits
 * Level: Easy
 * Unit: I
 * Topics: nested loops, digit extraction
 * LeetCode URL: https://leetcode.com/problems/add-digits/
 *
 * Submission Metrics:
 * - Status: Accepted (Passed all test cases)
 * - Language: Java
 *
 * Approach:
 * - Directly implements Unit I syllabus topics (Nested loops and Digit Extraction):
 * - Outer loop: Runs while the number has two or more digits (num >= 10).
 * - Inner loop: Extracts digits one by one using the modulo operator (num % 10)
 *   and accumulates them into a running sum, dividing num by 10 in each step.
 * - After all digits of the current number are processed, num is assigned the accumulated sum.
 * - This process repeats until num becomes a single-digit integer (< 10).
 * - Return the single digit value.
 *
 * Complexity Analysis:
 * - Time Complexity: O(log n), since the number of digits decreases exponentially in each iteration.
 * - Space Complexity: O(1) auxiliary space (uses only scalar integer variables: num and sum).
 */

class Solution {
    public int addDigits(int num) {
        // Outer loop continues until num is reduced to a single digit
        while (num >= 10) {
            int sum = 0;
            
            // Inner loop extracts and sums all individual digits
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            
            // Assign the accumulated sum back to num
            num = sum;
        }
        
        return num;
    }
}
