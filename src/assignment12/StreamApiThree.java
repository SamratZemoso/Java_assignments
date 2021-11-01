package assignment12;

import java.util.ArrayList;
import java.util.List;

public class StreamApiThree {

    public StreamApiThree(ArrayList<Student> studentArr) {

        // details of all male student in the computer science department
        List<Student> details = studentArr.stream()
                .filter(x -> x.gender.equals("Male"))
                .filter(y -> y.engDept.equals("Computer Science"))
                .toList();

        for(Student each: details) {
            System.out.println("Name: " + each.name + " Age: " + each.age + " Year of Enroll: " + each.yearOfEnroll);
        }

    }

}
