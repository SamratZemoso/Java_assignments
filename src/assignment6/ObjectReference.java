package assignment6;

public class ObjectReference {

    // constructor which takes string as an argument
    public ObjectReference(String input) {
        System.out.println(input);
    }

    public static void main(String[] args) {
        // object array of type ObjectReference
        ObjectReference[] objArr = new ObjectReference[3];

        // It will call the constructor everytime, when object is created
        objArr[0] = new ObjectReference("ONE");
        objArr[1] = new ObjectReference("TWO");
    }

}
