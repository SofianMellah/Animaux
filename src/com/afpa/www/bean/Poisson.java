package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;
import com.afpa.www.interfaces.Nager;

public abstract class Poisson extends Vertebre implements Nager {
    protected double vitesseNage;

    public Poisson(float poids, double vitesseNage) throws CreationImpossible {
        super(poids);
        this.vitesseNage = vitesseNage;
    }

    public double getVitesseNage() {
        return vitesseNage;
    }

    @Override
    public String toString() {
        return "sait nager";
    }

}
