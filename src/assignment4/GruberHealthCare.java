package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GruberHealthCare {

    public static void datesRange(String signUpDate, String currentDate) {
        // Creating DateTimeFormatter object with required format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu");

        // Creating objects with the format created with DateTimeFormatter
        LocalDate signUp = LocalDate.parse(signUpDate, format);
        LocalDate current = LocalDate.parse(currentDate, format);

        if(current.getYear() <= signUp.getYear()) {
            System.out.println("No Range");
        } else {
            // Calculating differences between signUp Year and Current Year
            int yearDiff = signUp.getYear() - current.getYear();
            signUp = signUp.minusYears(yearDiff);
            // Finding the start and end by adding & subtracting 30 days
            LocalDate startTime = signUp.minusDays(30);
            LocalDate stopTime = signUp.minusDays(-30);
            // Stop time shouldn't exceed current time
            if(current.compareTo(stopTime) < 0) {
                stopTime = current;
            }

            System.out.println(startTime.format(format) + " " + stopTime.format(format));
        }

    }

    public static void main(String[] args) {
        // To read the total no. of inputs
        int queries;
        Scanner sc = new Scanner(System.in);
        queries = sc.nextInt();

        // Iterating through each input
        for(int rep = 0; rep < queries; ++rep) {
            String signUpDate = sc.next();
            String currentDate = sc.next();
            datesRange(signUpDate, currentDate);
        }


    }

}

    /*

        input :
                5
                16-07-1998 27-06-2017
                04-02-2016 04-04-2017
                04-05-2017 04-04-2017
                04-04-2015 04-04-2016
                04-04-2015 15-03-2016

        output :
                16-06-2017 27-06-2017
                05-01-2017 06-03-2017
                No range
                05-03-2016 04-04-2016
                05-03-2016 15-03-2016


     */
