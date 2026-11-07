/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 04: LeetCode 1929 - Concatenation of Array
 * Level: Easy
 * Unit: I
 * Topics: Arrays, Loops
 * LeetCode URL: https://leetcode.com/problems/concatenation-of-array/
 *
 * Submission Metrics:
 * - Status: Accepted (Passed all test cases)
 * - Runtime: 0 ms (Beats 100.00% of Java submissions)
 * - Language: Java
 *
 * Approach:
 * - Create a new result array of size 2 * n, where n is the length of nums.
 * - Use Java's native System.arraycopy method to perform fast block memory copies.
 * - Copy nums to the first half: destination index 0 to n - 1.
 * - Copy nums to the second half: destination index n to 2 * n - 1.
 * - Return the concatenated array.
 *
 * Complexity Analysis:
 * - Time Complexity: O(n), where n is the length of nums. Native memory copy executes in linear time.
 * - Space Complexity: O(n) auxiliary space to store the concatenated result array of length 2n.
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        // Copy original array to the first half
        System.arraycopy(nums, 0, ans, 0, n);
        
        // Copy original array to the second half
        System.arraycopy(nums, 0, ans, n, n);
        
        return ans;
    }
}
