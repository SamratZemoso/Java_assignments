package assignment7.rodents;

public class Hamster extends Rodent {
    public Hamster(){
        System.out.println("A Hamster initialized");
    }

    @Override
    public void bite() {
        System.out.println("Hamster is biting");
    }
}
