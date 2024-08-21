package org.example;

public class Solution {
    public boolean isPalindrome(int x) {
        //check if x is negative
        //a palindrome number cannot be negative
        if (x < 0) {
            return false;
        }
        //convert the given x to a String
        String value = String.valueOf(x);
        //check if the string is a palindrome
        for (int i = 0; i < value.length()/2; i++) {
            if (value.charAt(i) != value.charAt(value.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

