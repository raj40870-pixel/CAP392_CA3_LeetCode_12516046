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
 * - This problem directly implements Unit II Object-Oriented Programming concepts:
 *     1. Instance Variables: Defined private int big, medium, small to hold available parking slots.
 *     2. Constructor: Initializes instance variables with input values using the 	his keyword.
 *     3. Method: addCar(int carType) checks slot availability using standard if-else control flow.
 *        If a slot is available (> 0), it decrements the count and returns true; otherwise returns false.
 *
 * Complexity Analysis:
 * - Time Complexity: O(1) constant time for constructor and addCar method execution.
 * - Space Complexity: O(1) auxiliary space (only 3 integer fields).
 */

class ParkingSystem {
    // Private instance variables representing available parking slots
    private int big;
    private int medium;
    private int small;

    // Constructor to initialize the parking slot counts
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    // Method to park a car based on carType
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }
}
