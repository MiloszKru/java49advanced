package day3.listy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList2 {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ala");
        myList.add("Ala");
        myList.add("Ala");
        myList.add("ma");
        myList.add("kota");
        myList.add("kota");
        myList.add("kota");
        myList.add("kota");

        displayDuplicates(myList);
        removeDuplicates(myList);
        System.out.println(myList);
    }

    private static void removeDuplicates(List<String> myList) {
        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            String omawiany = iterator.next();
            if (myList.indexOf(omawiany) != myList.lastIndexOf(omawiany)){
                iterator.remove();
            }
        }
    }

    public static void displayDuplicates(List<String> myList) {
        List<String> duplicates = new ArrayList<>();
        for(String s : myList) {
            if (myList.indexOf(s) != myList.lastIndexOf(s)){
                if (!duplicates.contains(s)) {
                    duplicates.add(s);
                }
            }
        }
        System.out.println(duplicates);
    }

}
