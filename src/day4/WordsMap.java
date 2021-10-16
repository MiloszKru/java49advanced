package day4;

import java.util.*;

public class WordsMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> map = WordsMap.countWords(text);
        System.out.println(map);

        List<Map.Entry<String, Integer>> listaWpisow = new ArrayList<>(countWords(text).entrySet());
        listaWpisow.sort(Map.Entry.comparingByValue());
        Collections.reverse(listaWpisow);
        System.out.println(listaWpisow);

    }


    public static Map<String, Integer> countWords(String text) {

        String[] words = text.toLowerCase().split("\\W+");
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }


}
