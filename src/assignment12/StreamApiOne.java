package assignment12;

import java.util.ArrayList;
import java.util.List;

public class StreamApiOne {

    public StreamApiOne(ArrayList<Student> studentArr) {

        // Printing only the department
        List<String> deptResult = studentArr.stream()
                .map(student -> student.engDept)
                .toList();

        System.out.println(deptResult);

    }

}
