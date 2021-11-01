package assignment6;

public class ConstructorOverloading {

    private int key;

    // Constructor without parameter
    public ConstructorOverloading() {
        this(50);
    }

    // constructor with one parameter
    public ConstructorOverloading(int key) {
        this.key = key;
    }

    public static void main(String[] args) {
        ConstructorOverloading constructor = new ConstructorOverloading();
        System.out.println(constructor.key);
    }


}
