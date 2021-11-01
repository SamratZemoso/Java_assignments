package assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiNine {

    public StreamApiNine(ArrayList<Student> studentArr) {

        Optional<Student> youngStudent = studentArr.stream()
                .filter(student -> (student.gender == "Male" && student.engDept == "Electronic"))
                .collect(Collectors.minBy(Comparator.comparing(Student::getAge)));


        if(youngStudent.isPresent()) {
            System.out.println(youngStudent.get().id +
                    " " + youngStudent.get().name +
                    " " + youngStudent.get().age);
        }

    }

}
