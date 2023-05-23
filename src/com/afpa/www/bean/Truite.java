package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;

public class Truite extends Poisson {
    static final int VITESSE_MIN = 1;
    static final int VITESSE_MAX = 10;
    public Truite(float poids, double vitesseNage) throws CreationImpossible{
        super(poids, vitesseNage);
        if (poids > 0.1 && poids < 10) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer la truite, le poids est compris entre 0.1 et 10");
        if (VITESSE_MIN < vitesseNage && VITESSE_MAX > vitesseNage) this.vitesseNage = vitesseNage;
        else throw new CreationImpossible("pas possible de créer la truite, la vitesse de nage est compris entre 1 et 10km/h");
    }
    @Override
    public int getVitesseNageMin() {
        return VITESSE_MIN;
    }

    @Override
    public int getvitesseMax() {
        return VITESSE_MAX;
    }
}
