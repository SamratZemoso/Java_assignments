package assignment12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamApiEight {

    public StreamApiEight(ArrayList<Student> studentArr) {

        studentArr.stream()
                .collect(Collectors.groupingBy(Student::getEngDept, Collectors.averagingDouble(Student::getPerTillDate)))
                .forEach((dept, result)->System.out.println("The average percentage of the " + dept + " department is : " + result));

    }

}
