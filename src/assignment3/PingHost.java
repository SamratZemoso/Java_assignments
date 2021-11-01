package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PingHost {

    public static void medianOfHost(String host, Integer dataPackets) throws Exception {

        // For calling external commands
        ProcessBuilder build = new ProcessBuilder("ping", "-c", String.valueOf(dataPackets), host);

        Process process = build.start();

        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        String res = null;
        ArrayList<Float> time = new ArrayList<>();

        while ((res = input.readLine()) != null) {
            int index = res.indexOf("time=");
            if (index != -1) {
                time.add(Float.parseFloat(res.substring(index + 5, res.indexOf("ms", index + 5))));
            }
        }

        int n = time.size();
        Collections.sort(time);

        float median;
        if (n % 2 == 1) {
            median = time.get(n / 2);
        } else {
            median = (time.get(n / 2) + time.get((n / 2) + 1)) / 2;
        }

        // printing the Median value
        System.out.println("Median time = " + median);

        while ((res = Error.readLine()) != null) {
            System.out.println("Exited with error" + res);
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String host = sc.next();
        Integer dataPackets = sc.nextInt();
        PingHost.medianOfHost(host, dataPackets);
    }

}

    /*
        input :
            www.google.com
            5

        output :
            Median time = 22.2
     */