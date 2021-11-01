package assignment7.innerclass;

public class OuterClassTwo extends OuterClassOne {
    class InnerClassTwo extends InnerClassOne {
        InnerClassTwo(String input) {
            super(input);
            System.out.println("Inner Class " + input);
        }
    }
}
