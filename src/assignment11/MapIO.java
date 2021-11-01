package assignment11;

import java.io.*;
import java.util.HashMap;

public class MapIO {
    private HashMap<Character, Integer> charMap;

    MapIO() {
        charMap = new HashMap<>();
    }

    public void countChar(String input) {
        for(Character ch: input.toLowerCase().toCharArray()) {
            if(charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
    }

    public static void main(String[] arg) throws IOException {
        // Input file name is taken from command line argument
        File inputFile = new File(arg[0]);
        BufferedReader bReader = new BufferedReader(new FileReader(inputFile));
        MapIO map = new MapIO();

        File outputFile = new File("result.txt");
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(outputFile));
        String str;

        while((str = bReader.readLine()) != null) {
            // count the character in input file
            map.countChar(str);
            System.out.println(str);
        }

        for(Character ch: map.charMap.keySet()) {
            // writing to the output file
            bWriter.write(ch + " " + map.charMap.get(ch));
            bWriter.newLine();
            System.out.println(ch + " " + map.charMap.get(ch));
        }

        bWriter.close();

    }

}
