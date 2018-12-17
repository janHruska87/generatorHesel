package sample;

import java.util.Random;

public class Heslo {

    private String heslo;
    private int znaku;
    private String mozneZnaky;

    private void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    private int getZnaku() {
        return znaku;
    }

    private void setZnaku(int znaku) {
        this.znaku = znaku;
    }

    private String getMozneZnaky() {
        return mozneZnaky;
    }

    private void setMozneZnaky(String mozneZnaky) {
        this.mozneZnaky = mozneZnaky;
    }

    public Heslo(int znaku, String mozneZnaky) {
        setZnaku(znaku);
        setMozneZnaky(mozneZnaky);
    }

    public String getHeslo()
    {
        String heslo = "";
        Random rn = new Random();
        for (int i = 1; i<=getZnaku();i++) {
            int pozice = rn.nextInt(getMozneZnaky().length());
            heslo += getMozneZnaky().charAt(pozice);
        }
        return heslo;
    }

}
