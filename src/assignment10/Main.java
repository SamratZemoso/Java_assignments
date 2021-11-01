package assignment10;

public class Main {
    public static void main(String[] args) {
        //Creating new SList
        SList<String> sList = new SList<>();

        //Get SListIterator of the SListObject
        SListIterator sListIterator = sList.iterator();

        sListIterator.insert("11");
        sListIterator.insert("25");
        sListIterator.insert("36");

        sListIterator.remove("36");

        System.out.println(sList.toString());
    }
}
