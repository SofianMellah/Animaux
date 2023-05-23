package com.afpa.www.bean;

import com.afpa.www.interfaces.Courir;
import com.afpa.www.interfaces.Deplacer;
import com.afpa.www.interfaces.Nager;

public abstract class Amphibien extends Vertebre implements Nager, Courir {
    protected double vitesseNage;
    protected double vitesseCourse;

    public Amphibien(float poids, double vitesseNage, double vitesseCourse) {
        super(poids);
        this.vitesseNage = vitesseNage;
        this.vitesseCourse = vitesseCourse;
    }
    public String toString() {
        return "L'amphibien sait nager et courir";
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
