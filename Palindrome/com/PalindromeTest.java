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
     * 文字列は空っぽの場合
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
     * 文字列はスペースの場合
     * expected:　期待の値（true）
     * actual: 実際の値 
     */
    @Test
    public void testSpaceString(){
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(" ");
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文字列は小文字と大文字もある場合
     * expected:　期待の値（true）
     * actual: 実際の値
     */
    @Test
    public void testMixedCase(){
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome("Php");
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文字列は数字の場合 
     * expected:　期待の値（true）
     * actual: 実際の値
     */
    @Test
    public void testNumericPalindrome(){
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome("22022022");
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文字列は特殊文字の場合
     * expected:　期待の値（true）
     * actual: 実際の値
     */
    @Test
    public void testSpecialCharacters(){
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome("/@$*&&*$@/");
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文章の場合
     * expected:　期待の値（true）
     * actual: 実際の値
     */
    @Test
    public void testSentences(){
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome("Mada abc cba Adam");
        Assert.assertEquals(expected,actual);
    }

    /*
     * 文字列は長い文字の場合
     * expected:　期待の値（true）
     * actual: 実際の値
     */
    @Test
    public void testPerformance(){

        // 100,000文字の回文の生成
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("a");
        }
        String largePalindrome = stringBuilder.toString();

        // 回文の確認
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(largePalindrome);
        Assert.assertEquals(expected, actual); 
    }

    
}
