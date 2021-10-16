package day3.interfejs1;

public class Zad1Main {
    public static void main(String[] args) {


        Instrumental piano1 = new Piano();
        Instrumental guitar1 = new Guitar();
        Instrumental drum1 = new Drum();

        piano1.play();
        guitar1.play();
        drum1.play();
    }
}
