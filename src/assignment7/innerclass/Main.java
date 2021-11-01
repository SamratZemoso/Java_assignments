package assignment7.innerclass;

public class Main {
    public static void main(String[] args) {
        OuterClassTwo outerTwo = new OuterClassTwo();
        OuterClassTwo.InnerClassTwo innerTwo = outerTwo.new InnerClassTwo("Hello");
    }
}
