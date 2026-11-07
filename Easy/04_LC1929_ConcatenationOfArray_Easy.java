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
 * - Language: Java
 *
 * Approach:
 * - According to Unit I syllabus concepts (1D Arrays & Loops):
 * - We find the length of the given array, n = nums.length.
 * - We allocate a new integer array ans of size 2 * n.
 * - We iterate using a standard for loop from i = 0 to n - 1:
 *     - Place the element at the first half: ans[i] = nums[i]
 *     - Place the element at the second half: ans[i + n] = nums[i]
 * - Return the resultant concatenated array ans.
 *
 * Complexity Analysis:
 * - Time Complexity: O(n), where n is the length of nums (single pass for loop).
 * - Space Complexity: O(n) auxiliary space to store the new array of size 2n.
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
    }
}
