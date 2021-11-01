package assignment12;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiFour {

    public StreamApiFour(ArrayList<Student> studentArr) {

        // No. of Male and Female Students
        Map<String, Long> noOfStud = studentArr.stream()
                .map(total -> total.gender)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));

        for(String key: noOfStud.keySet()) {
            String value = noOfStud.get(key).toString();
            System.out.println(key + ": " + value);
        }

    }

}
