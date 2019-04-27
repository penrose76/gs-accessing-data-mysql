package test;

public class Testowy {

    public Zwierze rozpoznajZwierzaka(String dzwiek) {
        if (dzwiek.equals("hau")) {
            return new Pies();
        } else {
            return new Kot();
        }
    }


    public void main(String[] arg){


    }
}
