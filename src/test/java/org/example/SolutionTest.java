package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindromeNumTest() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(-121));
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(221));
        assertFalse(solution.isPalindrome(1234454321));
        assertTrue(solution.isPalindrome(1111));
        assertTrue(solution.isPalindrome(1111));
        assertTrue(solution.isPalindrome(11511));
    }
}