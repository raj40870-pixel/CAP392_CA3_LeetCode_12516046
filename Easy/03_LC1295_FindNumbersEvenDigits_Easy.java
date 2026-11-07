// Student Name: Kamaljit
// Registration Number: 12516046
// Problem: LeetCode 1295 - Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                digits++;
                num /= 10;
            }
            if (digits % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
