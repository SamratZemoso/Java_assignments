package assignment12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamApiTen {

    public StreamApiTen(ArrayList<Student> studentArr) {
        studentArr.stream()
                .filter(dept -> dept.engDept =="Computer Science")
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()))
                .forEach((male, female) -> System.out.println(male + " --- " + female));
    }

}
