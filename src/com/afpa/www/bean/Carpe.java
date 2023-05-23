package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;

public class Carpe extends Poisson{
    static final int VITESSE_MIN = 1;
    static final int VITESSE_MAX = 6;
    public Carpe(float poids, double vitesseNage) throws CreationImpossible {
        super(poids, vitesseNage);
        if (poids > 0.1 && poids < 25) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer la carpe, le poids n'est pas bon");
        if (VITESSE_MIN < vitesseNage && VITESSE_MAX > vitesseNage) this.vitesseNage = vitesseNage;
        else throw new CreationImpossible("Impossible de créer la carpe, la vitesse de nage n'est pas bonne");
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
