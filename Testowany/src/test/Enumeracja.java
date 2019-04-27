package test;

public enum Enumeracja {

    KOT(1), PIES(2);

    String tekst;

    Enumeracja(int zwierze) {

        if (zwierze == 1) {

            tekst = "Kotek 123";
        } else {

            tekst = "Piesek 123";
        }
    }

    public String getTekst() {
        return tekst;
    }
}
