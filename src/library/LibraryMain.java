package library;

import java.util.Arrays;

public class LibraryMain {
    public static void main(String[] args) {

        Author authorOne = new Author("Jan", "Brzechwa");
        Author authorTwo = new Author("Adam", "Mickiewicz");
        Copy copyOne = new Book(authorOne, "Bajki dla dzieci");
        Copy copyTwo = new Magazine(authorTwo, "Pan Tadeusz");
        Copy[] copies = new Copy[]{copyOne, copyTwo, copyOne, copyOne};
        Library library = new Library(copies);

       try {
           System.out.println(Arrays.toString(library.findByTitle("Pan")));
       } catch (NoBooksException e) {
           e.printStackTrace();
           System.out.println("Nie znaleziono ksiązki o takim tytule");
       }
        /* System.out.println(Arrays.toString(library.findByAuthor(authorOne)));
        System.out.println(Arrays.toString(library.findByAuthor(authorTwo)));
*/

        System.out.println(library.findAuthorWithMostBooks());

    }
}
