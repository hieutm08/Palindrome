package com;

public class Palindrome {

    /*
     * 回文をチェックするための関数
     * param: str　#チェックされる文字列
     */
    public static boolean isPalindrome(String str) {
        //もし文字列はnullだったら->チャックしない
        if (str == null) {
            return false;
        }
        
        //文字列の長さ
        int n = str.length();
       
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n - i -1)) {
                return false;
            }
        }
        return true;
    }
}
