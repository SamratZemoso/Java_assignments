package assignment12;

import java.util.ArrayList;
import java.util.List;

public class StreamApiTwo {

    public StreamApiTwo(ArrayList<Student> studentArr) {

        // get names of students enrolled after 2018
        List<Student> yearResult = studentArr.stream()
                .filter(year -> year.yearOfEnroll > 2018)
                .toList();

        for(Student each: yearResult) {
            System.out.println(each.name);
        }
    }

}
