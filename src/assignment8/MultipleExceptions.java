package assignment8;

// custom exception type 1
class ExceptionType1 extends Exception {
    public ExceptionType1(String sample) {
        super(sample);
    }
}

// custom exception type 2
class ExceptionType2 extends Exception {
    public ExceptionType2(String sample) {
        super(sample);
    }
}

// custom exception type 3
class ExceptionType3 extends Exception {
    public ExceptionType3(String sample) {
        super(sample);
    }
}

public class MultipleExceptions {

    public static void displayException(int input) {
        // throwing the custom exception in try block
        try {
            if(input == 1) throw new ExceptionType1("Exception - 1");
            else if(input == 2) throw new ExceptionType2("Exception - 2");
            else if(input == 3) throw new ExceptionType3("Exception - 3");
            else throw new NullPointerException();
        }

        // Catch block for catching the respective exception
        catch (ExceptionType1 | ExceptionType2 | ExceptionType3 e) {
            System.out.println(e.getMessage());
        }

        // Finally block
        finally {
            System.out.println("In Finally block");
        }
    }

    public static void main(String[] args) {
        MultipleExceptions.displayException(2);
    }
}
