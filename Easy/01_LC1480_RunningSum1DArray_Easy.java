/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 01: LeetCode 1480 - Running Sum of 1D Array
 * Level: Easy
 * Unit: I
 * Topics: Arrays, loops, arithmetic operations
 * LeetCode URL: https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Submission Metrics:
 * - Status: Accepted (54/54 testcases passed)
 * - Runtime: 0 ms (Beats 100.00% of Java submissions)
 * - Memory Usage: 43.30 MB (Beats 99.48% of Java submissions)
 *
 * Approach:
 * - We compute the prefix running sum in-place without using extra array memory.
 * - For index i (starting from 1 up to n-1), nums[i] is updated as:
 *     nums[i] = nums[i] + nums[i - 1]
 * - By adding the running sum accumulated up to (i - 1) directly into nums[i],
 *   each element stores the cumulative sum from index 0 through index i.
 * - Return the modified nums array.
 *
 * Complexity Analysis:
 * - Time Complexity: O(n), where n is the number of elements in nums (single loop traversal).
 * - Space Complexity: O(1) auxiliary space (in-place modification, no extra data structures).
 */

class Solution {
    public int[] runningSum(int[] nums) {
        // Iterate starting from index 1 to length - 1
        for (int i = 1; i < nums.length; i++) {
            // Add previous running sum to current element
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
