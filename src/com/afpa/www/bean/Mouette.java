package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;
import com.afpa.www.interfaces.Nager;
import com.afpa.www.interfaces.Voler;

public class Mouette extends Oiseau implements Voler, Nager {
    protected double vitesseNage;
    protected double vitesseVol;
    protected double vitesseCourse;
    static final int VITESSE_NAGE_MIN = 1;
    static final int VITESSE_NAGE_MAX = 3;
    static final int VITESSE_VOL_MIN = 20;
    static final int VITESSE_VOL_MAX = 70;
    static final int VITESSE_COURSE_MIN = 2;
    static final int VITESSE_COURSE_MAX = 8;

    public Mouette(float poids, double vitesseNage, double vitesseVol, double vitesseCourse) throws CreationImpossible {
        super(poids);
        if (poids > 0.1 && poids <= 1) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer la mouette, le poids n'est pas correct");
        if (VITESSE_NAGE_MIN < vitesseNage && vitesseNage < VITESSE_NAGE_MAX) this.vitesseNage = vitesseNage;
        else throw new CreationImpossible("Impossible de créer la mouette, la vitesse de nage n'est pas correct");
        if (VITESSE_VOL_MIN < vitesseVol && vitesseVol < VITESSE_VOL_MAX) this.vitesseVol = vitesseVol;
        else throw new CreationImpossible("Impossible de créer la mouette, la vitesse de vol n'est pas correct");
        if (VITESSE_COURSE_MIN < vitesseCourse && VITESSE_COURSE_MAX > vitesseCourse) this.vitesseCourse = vitesseCourse;
        else throw new CreationImpossible("Impossible de créer la mouette, la vitesse de course n'est pas correct");
    }

    @Override
    public String toString() {
        return "Sait voler et nager";
    }

    @Override
    public int getvitesseMax() {
        return 0;
    }

    @Override
    public int getVitesseNageMin() {
        return 0;
    }

    @Override
    public int getVitesseVolMin() {
        return 0;
    }
}
