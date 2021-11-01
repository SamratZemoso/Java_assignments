package assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {

    public static boolean checkSentence(String input) {
        // checks sentence that it begins with a capital letter and ends with a period.
        if(Pattern.matches("^[A-Z]+.*\\.$", input)) {
            return true;
        }
        return false;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        sc.nextLine();
        for(int t = 0; t < queries; ++t) {
            String input = sc.nextLine();
            if(RegexExpression.checkSentence(input)) {
                System.out.println("Valid Sentence");
            } else {
                System.out.println("Not a Valid Sentence");
            }
        }
    }

}

    /*

        input :
               2
               questions?
               Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.

        output :
                Not a Valid Sentence
                Valid Sentence

     */