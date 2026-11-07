/**
 * Course: CAP392 - Java Programming
 * Assessment: CA3 (LeetCode Problem Solving using Java)
 * Student Name: Kamaljit
 * Registration Number: 12516046
 * 
 * Problem 05: LeetCode 1603 - Design Parking System
 * Level: Easy
 * Unit: II
 * Topics: class, object, constructor, instance variables, methods
 * LeetCode URL: https://leetcode.com/problems/design-parking-system/
 *
 * Submission Metrics:
 * - Status: Accepted (Passed all test cases)
 * - Language: Java
 *
 * Approach:
 * - Implement an object-oriented ParkingSystem class using private instance variables (big, medium, small).
 * - Initialize the slot capacities via the constructor using the 	his keyword.
 * - When addCar(carType) is invoked:
 *     - If carType == 1 (big) and big slots > 0: decrement big and return true.
 *     - If carType == 2 (medium) and medium slots > 0: decrement medium and return true.
 *     - If carType == 3 (small) and small slots > 0: decrement small and return true.
 *     - Otherwise, return false since no slots of that size are available.
 *
 * Complexity Analysis:
 * - Time Complexity: O(1) for both constructor initialization and each addCar operation.
 * - Space Complexity: O(1) auxiliary space (only stores 3 integer fields for slot counts).
 */

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        } else if (carType == 2 && medium > 0) {
            medium--;
            return true;
        } else if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }
}
