package assignment7.rodents;

public class Gerbil extends Rodent {

    public Gerbil(){
        System.out.println("A Gerbil initialized");
    }

    @Override
    public void bite() {
        System.out.println("Gerbil is biting");
    }

}
