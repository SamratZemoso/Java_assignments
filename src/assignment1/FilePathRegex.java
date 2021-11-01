package assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FilePathRegex {

    private LinkedList<String> queue;
    private ArrayList<String> matchFiles;
    private String regex;

    public void findFiles(String input) {
        queue = new LinkedList<>();
        matchFiles = new ArrayList<>();
        this.regex = input;
        queue.push("/home/samram");

        while(!queue.isEmpty()) {
            String path = queue.pop();
            File file = new File(path);
            if(Pattern.matches(regex, file.getName())) {
                matchFiles.add(path);
            }
            // If a file is a Directory, we iterate inside the directory
            if(file.isDirectory()) {
                for(File curFile : file.listFiles()) {
                    queue.add(path + "/" + curFile.getName());
                }
            }
        }

        // Printing all the match files
        for(String allMatches: matchFiles) {
            System.out.println(allMatches);
        }

    }


    public static void main(String[] args) {
        FilePathRegex filePathRegex = new FilePathRegex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern to search - ");
        String input = sc.next();
        filePathRegex.findFiles(input);
    }

}

/*

    input:
    .*\.txt // I want all the text files that are present in /home directory

    output:
    /home/samram/sample2.txt
    /home/samram/sample1.txt
    /home/samram/.cache/tracker/locale-for-miner-apps.txt
    /home/samram/.cache/tracker/last-crawl.txt
    /home/samram/.cache/tracker/db-version.txt
    /home/samram/.cache/tracker/first-index.txt
    /home/samram/.cache/tracker/db-locale.txt
    /home/samram/.cache/tracker/parser-version.txt


 */
