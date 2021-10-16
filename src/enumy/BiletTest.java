package enumy;

public class BiletTest {
    public static void main(String[] args) {

        Bilet bilet1 = Bilet.NORMALNY_CALODNIOWY;
        Bilet bilet2 = Bilet.NORMALNY_GODZINNY;
        Bilet bilet3 = Bilet.ULGOWY_CALODNIOWY;
        Bilet bilet4 = Bilet.ULGOWY_GODZINNY;

        System.out.println(bilet1.pobierzCene());
        System.out.println(bilet1.pobierzCzasJazdy());
        System.out.println(bilet2.pobierzCene());
        System.out.println(bilet2.pobierzCzasJazdy());
        System.out.println(bilet3.pobierzCene());
        System.out.println(bilet3.pobierzCzasJazdy());
        System.out.println(bilet4.pobierzCene());
        System.out.println(bilet4.pobierzCzasJazdy());

        bilet1.wyswietlDaneOBilecie();
        

    }
}
