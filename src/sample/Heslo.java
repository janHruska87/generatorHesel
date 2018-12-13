package sample;

import java.util.Random;

public class Heslo {

    private String Heslo;
    private int znaku;
    private String mozneZnaky;

    public Heslo(int znaku, String mozneZnaky) {
        this.znaku = znaku;
        this.mozneZnaky = mozneZnaky;
    }

    public String getHeslo()
    {
        String heslo = "";
        for (int i = 1; i<this.znaku;i++) {
            Random rn = new Random();
            int znakNaPozici = rn.nextInt(mozneZnaky.length());
            System.out.println("Vygenerovano.." + mozneZnaky.indexOf()znakNaPozici);


        }
        return "test";
    }

}
