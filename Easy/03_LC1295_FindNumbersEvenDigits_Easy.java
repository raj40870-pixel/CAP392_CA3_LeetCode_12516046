/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 03: LeetCode 1295 - Find Numbers with Even Number of Digits
 * Level: Easy
 * Unit: I
 * Topics: Arrays, loops, digit counting, conditional statements
 * LeetCode URL: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Submission Metrics:
 * - Status: Accepted (Passed all test cases)
 * - Language: Java
 *
 * Approach:
 * - We iterate through each integer in the given array nums.
 * - For each number, we count how many digits it contains by repeatedly dividing by 10
 *   until the number reduces to 0.
 * - If the total digit count is even (i.e., digits % 2 == 0), we increment evenCount.
 * - Finally, return evenCount.
 *
 * Complexity Analysis:
 * - Time Complexity: O(n * d), where n is the number of elements and d is the average number of digits (since nums[i] <= 10^5, d <= 6, effectively O(n)).
 * - Space Complexity: O(1) auxiliary space (uses only scalar variables: evenCount, digits, and num).
 */

class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        
        // Loop through each number in the array
        for (int num : nums) {
            int digits = 0;
            
            // Count the number of digits in the current number
            while (num > 0) {
                digits++;
                num /= 10;
            }
            
            // Check if the number of digits is even
            if (digits % 2 == 0) {
                evenCount++;
            }
        }
        
        return evenCount;
    }
}
