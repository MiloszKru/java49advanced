package day3.typy_generyczne2;

public class MyListMain {

    public static void main(String[] args) {

    MyList<String> newList = new MyList<>(10);

    newList.addElement("Ala");
    newList.addElement("ma");
    newList.addElement("kota");

    newList.getSize();
    System.out.println(newList);


    }
}
