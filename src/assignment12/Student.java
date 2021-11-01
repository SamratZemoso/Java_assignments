package assignment12;

<<<<<<< HEAD

public class Student {

    public int id;
    public String name;
    public int age;
    public String gender;
    public String engDept;
    public int yearOfEnroll;
    public double perTillDate;
=======
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDept;
    private int yearOfEnroll;
    private double perTillDate;
>>>>>>> b192bb19b0ce867fb42160776b70734ca860bd36

    Student(int id, String name, int age, String gender, String engDept, int yearOfEnroll, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDept = engDept;
        this.yearOfEnroll = yearOfEnroll;
        this.perTillDate = perTillDate;
    }

<<<<<<< HEAD
    public String getGender() {
        return gender;
    }

    public String getEngDept() {
        return engDept;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public int getAge() {
        return age;
    }
=======
    public static void main(String[] arg) {

        ArrayList<Student> studentArr = new ArrayList<>();

        studentArr.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentArr.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentArr.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentArr.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentArr.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentArr.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentArr.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentArr.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentArr.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentArr.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentArr.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentArr.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentArr.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentArr.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentArr.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentArr.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentArr.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        // Printing only the department
        List<String> deptResult = studentArr.stream()
                .map(student -> student.engDept)
                .toList();

        System.out.println(deptResult);

        // get names of students enrolled after 2018
        List<Student> yearResult = studentArr.stream()
                .filter(year -> year.yearOfEnroll > 2018)
                .toList();

        for(Student each: yearResult) {
            System.out.println(each.name);
        }

        // details of all male student in the computer science department
        List<Student> details = studentArr.stream()
                .filter(x -> x.gender.equals("Male"))
                .filter(y -> y.engDept.equals("Computer Science"))
                .toList();

        for(Student each: details) {
            System.out.println("Name: " + each.name + " Age: " + each.age + " Year of Enroll: " + each.yearOfEnroll);
        }

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

        // average age of male and female
       List<Integer> maleAge = studentArr.stream()
                .filter(item -> item.gender.equals("Male"))
                .map(item -> item.age)
               .toList();

        List<Integer> femaleAge = studentArr.stream()
                .filter(item -> item.gender.equals("Female"))
                .map(item -> item.age)
                .toList();

        System.out.println("------");
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

>>>>>>> b192bb19b0ce867fb42160776b70734ca860bd36
}
