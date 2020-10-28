package ua.com.foxminded;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Anagrams anagram = new Anagrams();
        String text = readText();
        String reversedText = anagram.reverseText(text);
        System.out.println(reversedText);
    }

    public static String readText() {
        Scanner scaner = new Scanner(System.in);
        return scaner.nextLine();
    }
}
