package assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class Alphabets {

    // Alphabets count and a set to store Alphabets
    private static int TOTAL_ALPHABETS = 26;
    private static HashSet storeAlphabets;

    // Function to check whether there are only
    public static boolean containsEveryAlphabet(String inputText) {
        storeAlphabets = new HashSet();
        // Convert each word to LowerCase and Character Array
        for(char ch: inputText.toLowerCase().toCharArray()) {
            // Checking whether a character is present in HashSet or not
            if(!storeAlphabets.contains(ch)) {
                storeAlphabets.add(ch);
                // If every Alphabet is present in HashSet then we will return true
                if(storeAlphabets.size() == TOTAL_ALPHABETS) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(containsEveryAlphabet(input)) {
            System.out.println(input + ": contains all Alphabets");
        } else {
            System.out.println(input + ": doesn't contain all Alphabets");
        }
    }

}

/*
    Input : Hello World
    Output: Hello World: doesn't contain all Alphabets

    Input : Farmer jack realized that big yellow quilts were expensive
    Output : Farmer jack realized that big yellow quilts were expensive: contains all Alphabets

 */