package main;

import controller.KonzolVezerlo;
import modell.KonzolModell;
import view.KonzolNezet;

public class Dolgozat1007 {

    public static void main(String[] args) {
        KonzolModell modell = new KonzolModell();
        KonzolNezet nezet = new KonzolNezet();
        
        new KonzolVezerlo(modell, nezet);
    }
    
}
