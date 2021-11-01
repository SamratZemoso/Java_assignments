package assignment5.main;

// packages are imported to access the Methods
import assignment5.data.Data;
import assignment5.singleton.Singleton;

public class Main {
    public static void main(String[] arg) {
        // First class object and accessing its methods
        Data data = new Data();
        data.printVariables();

        // Second class object and accessing its methods
        Singleton singleton = new Singleton();
        singleton.printData();

    }
}
