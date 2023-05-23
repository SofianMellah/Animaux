package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;
import com.afpa.www.interfaces.Nager;

public class Baleine extends Mammifere implements Nager {
    protected double vitesseNage;
    static final int VITESSE_NAGE_MIN = 20;
    static final int VITESSE_NAGE_MAX = 40;

    public Baleine(float poids, double vitesseNage) throws CreationImpossible {
        super(poids);
        if (poids > 10 && poids <= 50000) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer la baleine, le poids n'est pas correct");
        if (VITESSE_NAGE_MIN < vitesseNage && vitesseNage < VITESSE_NAGE_MAX) this.vitesseNage = vitesseNage;
        else throw new CreationImpossible("Impossible de créer la baleine, la vitesse de nage n'est pas correct");
    }

    @Override
    public String toString() {
        return "sait nager";
    }

    @Override
    public int getvitesseMax() {
        return 0;
    }

    @Override
    public int getVitesseNageMin() {
        return 0;
    }
}
