package assignment12;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiSeven {

    public StreamApiSeven(ArrayList<Student> studentArr) {

        // No. of Students in each department
        Map<String, Long> depRes = studentArr.stream()
                .map(dept -> dept.engDept)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));

        for(String res: depRes.keySet()) {
            String value = depRes.get(res).toString();
            System.out.println(res + ": " + value);
        }

    }

}
