package com;

import java.util.Scanner;

public class Palindrome {
    /*
     * 実行用のメインメソッド
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
       
        while (true) {
            System.out.print("Enter a string to check (type 'exit' to quit): ");
            str = scanner.nextLine();

            if (str.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program");
                break;
            }

            if (isPalindrome(str)) {
                System.out.println( "True");
            } else {
                System.out.println("False");
            }
        }

        scanner.close();
    }

    /*
     * 回文をチェックするための関数
     * param: str #チェックされる文字列
     */
    public static boolean isPalindrome(String str) {
        // もし文字列はnullだったら->チャックしない
        if (str == null) {
            return false;
        }

        // 小文字を同じにする
        String strUpLower = str.toLowerCase();

        // 文字列の長さ
        int n = strUpLower.length();

        for (int i = 0; i < n / 2; i++) {
            if (strUpLower.charAt(i) != strUpLower.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
