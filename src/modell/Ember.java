package modell;

public class Ember {
    private String nev, nyelv;
    private int kor;
    private boolean szuletesnap;

    public Ember(String nev, int kor, String nyelv, boolean szuletesnap) {
        this.nev = nev;
        this.nyelv = nyelv;
        this.kor = kor;
        this.szuletesnap = szuletesnap;
    }

    public String getNev() {
        return nev;
    }

    public String getNyelv() {
        return nyelv;
    }

    public int getKor() {
        return kor;
    }

    public boolean isSzuletesnap() {
        return szuletesnap;
    }
    
}
