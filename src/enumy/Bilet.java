package enumy;

public enum Bilet {

    ULGOWY_GODZINNY(1.60d,1),
    ULGOWY_CALODNIOWY(3.20d,24),
    NORMALNY_GODZINNY(2.00d,1),
    NORMALNY_CALODNIOWY(4.00d,24),
    BRAK_BILETU(0.0d,0);

   private double cena;
   private int czasJazdyWGodzinach;

    Bilet(double cena, int czasJazdy) {
        this.cena = cena;
        this.czasJazdyWGodzinach = czasJazdy;
    }

    public double pobierzCene() {
        return cena;
    }

    public int pobierzCzasJazdy() {
        return czasJazdyWGodzinach;
    }

    public void wyswietlDaneOBilecie(){
        System.out.println("Cena biletu: " + this.pobierzCene() + " a czas jazdy wynosi " + this.pobierzCzasJazdy() + " godzin");
    }

    public static Bilet getOodpowiedniBilet(int wiek, int czasJazdy, double dostepnaKwota) {
        Bilet odpowiedniBilet = null;
        if (wiek > 18) {
            if (czasJazdy > 1) {
                odpowiedniBilet = Bilet.NORMALNY_CALODNIOWY;
            } else {
                odpowiedniBilet = Bilet.NORMALNY_GODZINNY;
            }
        } else {
            if (czasJazdy > 1) {
                odpowiedniBilet = Bilet.ULGOWY_CALODNIOWY;
            } else {
                odpowiedniBilet = Bilet.ULGOWY_GODZINNY;
            }
        }
        if (odpowiedniBilet.pobierzCene() > dostepnaKwota) {
            odpowiedniBilet = Bilet.BRAK_BILETU;
        }

        return odpowiedniBilet;
    }

}
