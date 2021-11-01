package assignment7.rodents;

public class Mouse extends Rodent {
    public Mouse(){
        System.out.println("A Mouse initialized");
    }

    @Override
    public void bite() {
        System.out.println("Mouse is biting");
    }
}
