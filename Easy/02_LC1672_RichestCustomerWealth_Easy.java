/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 02: LeetCode 1672 - Richest Customer Wealth
 * Level: Easy
 * Unit: I
 * Topics: 2D arrays, nested loops, maximum value
 * LeetCode URL: https://leetcode.com/problems/richest-customer-wealth/
 *
 * Submission Metrics:
 * - Status: Accepted (Passed all test cases)
 * - Language: Java
 *
 * Approach:
 * - Each row in the 2D array represents a customer, and each column represents a bank account.
 * - We iterate over each customer using an outer loop.
 * - An inner loop calculates the sum of money (wealth) that the customer has across all their accounts.
 * - We maintain a running maximum (maxWealth) and update it using Math.max(maxWealth, currentSum).
 * - After checking all customers, maxWealth contains the wealth of the richest customer.
 *
 * Complexity Analysis:
 * - Time Complexity: O(m * n), where m is the number of customers and n is the number of bank accounts per customer.
 * - Space Complexity: O(1) auxiliary space (uses only two scalar integer variables: maxWealth and currentSum).
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
      
        // Outer loop: Iterate through each customer (row)
        for (int[] customer : accounts) {
            int currentSum = 0;
          
            // Inner loop: Sum wealth across all bank accounts
            for (int bankMoney : customer) {
                currentSum += bankMoney;
            }
         
            // Keep track of the maximum wealth found so far
            maxWealth = Math.max(maxWealth, currentSum);
        }
        
        return maxWealth;
    }
}
