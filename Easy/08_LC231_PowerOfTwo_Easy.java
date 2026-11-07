// Student Name: Kamaljit
// Registration Number: 12516046
// Problem: LeetCode 231 - Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
