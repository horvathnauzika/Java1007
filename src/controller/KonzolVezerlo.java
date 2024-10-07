package controller;

import modell.KonzolModell;
import view.KonzolNezet;


public class KonzolVezerlo {
    KonzolModell modell;
    KonzolNezet nezet;

    public KonzolVezerlo(KonzolModell modell, KonzolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        start();
    }

    private void start() {
        nezet.kiiras(modell.bemutatkozas());
    }
}
