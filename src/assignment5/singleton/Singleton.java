package assignment5.singleton;

public class Singleton {
    private String sample;

    // Create an instance of Singleton and return that object
    public static Singleton initVar(String str) {
        Singleton obj = new Singleton();
        return obj;
    }

    // Printing the local string variable
    public void printData() {
        System.out.println(sample);
    }

}
