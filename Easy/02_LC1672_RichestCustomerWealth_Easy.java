// Student Name: Kamaljit
// Registration Number: 12516046
// Problem: LeetCode 1672 - Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentSum = 0;
            for (int bankMoney : customer) {
                currentSum += bankMoney;
            }
            maxWealth = Math.max(maxWealth, currentSum);
        }
        return maxWealth;
    }
}
