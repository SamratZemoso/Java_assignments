package assignment12;

import java.util.ArrayList;
import java.util.List;

public class StreamApiFive {

    public StreamApiFive(ArrayList<Student> studentArr) {

        // average age of male and female
        List<Integer> maleAge = studentArr.stream()
                .filter(item -> item.gender.equals("Male"))
                .map(item -> item.age)
                .toList();

        List<Integer> femaleAge = studentArr.stream()
                .filter(item -> item.gender.equals("Female"))
                .map(item -> item.age)
                .toList();

        int sumOfMales = 0, sumOfFemales = 0;
        for(Integer x: maleAge) {
            sumOfMales += x;
        }

        for(Integer x: femaleAge) {
            sumOfFemales += x;
        }

        double avgMales = sumOfMales / maleAge.size(), avgFemales = sumOfFemales / femaleAge.size();
        System.out.println("Males average : " + avgMales);
        System.out.println("Females average : " + avgFemales);

    }

}
