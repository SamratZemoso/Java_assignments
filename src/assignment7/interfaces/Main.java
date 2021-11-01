package assignment7.interfaces;

public class Main extends ConcreteClass implements Fourth {
    @Override
    public void display() {
        System.out.println("This is Main class");
    }

    @Override
    public void firstOne() {
        System.out.println("First One");
    }

    @Override
    public void firstTwo() {
        System.out.println("First Two");
    }

    @Override
    public void secondOne() {
        System.out.println("Second One");
    }

    @Override
    public void secondTwo() {
        System.out.println("Second Two");
    }

    @Override
    public void thirdOne() {
        System.out.println("Third One");
    }

    @Override
    public void thirdTwo() {
        System.out.println("Third Two");
    }

    @Override
    public void fourthMethod() {
        System.out.println("Fourth");
    }

    public void implementFirst(First first){
        first.firstOne();
        first.firstTwo();
    }

    public void implementSecond(Second second){
        second.secondOne();
        second.secondTwo();
    }

    public void implementThird(Third third){
        third.thirdOne();
        third.thirdTwo();
    }

    public void implementFourth(Fourth fourth){
        fourth.fourthMethod();
    }

    public static void main(String[] args) {
        Main mainObj = new Main();

        mainObj.implementFirst(mainObj);
        mainObj.implementSecond(mainObj);
        mainObj.implementThird(mainObj);
        mainObj.implementFourth(mainObj);

    }

}
