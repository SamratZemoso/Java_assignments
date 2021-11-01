package assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiSix {

    public StreamApiSix(ArrayList<Student> studentArr) {

        Optional<Student> student = studentArr.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getPerTillDate)));

        if(student.isPresent()) {
            System.out.println(student.get().id +
                    " " + student.get().name +
                    " " + student.get().age +
                    " " + student.get().engDept);
        }

    }

}
