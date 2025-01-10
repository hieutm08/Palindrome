package com;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    /*
     * 回文が正しい場合
     * expected:　期待の値（true）
     * actual: 実際の値
     */
    @Test
    public void testPalindromeIsCorrect(){
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome("radar");
        Assert.assertEquals(expected,actual);
    }
    
    /*
     * 回文が正しくない場合
     * expected:　期待の値（false）
     * actual: 実際の値
     */
    @Test
    public void testPalindromeIsIncorrect(){
        boolean expected = false;
        boolean actual = Palindrome.isPalindrome("hello");
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文字列は空の場合
     * expected:　期待の値（true）
     * actual: 実際の値 
     */
    @Test
    public void testEmptyString(){
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome("");
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文字列はnullの場合
     * expected:　期待の値（false）
     * actual: 実際の値
     */
    @Test
    public void testNullString(){
        boolean expected = false;
        boolean actual = Palindrome.isPalindrome(null);
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文字列は小文字と大文字もある場合
     * expected:　期待の値（false）
     * actual: 実際の値
     */
    @Test
    public void testMixedCase(){
        boolean expected = false;
        boolean actual = Palindrome.isPalindrome("Php");
        Assert.assertEquals(expected,actual);
    }

}
