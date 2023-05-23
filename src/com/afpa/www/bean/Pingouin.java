package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;
import com.afpa.www.interfaces.Courir;
import com.afpa.www.interfaces.Nager;

public class Pingouin extends Oiseau implements Nager, Courir {
    protected double vitesseNage;
    protected double vitesseCourse;
    static final int VITESSE_NAGE_MIN = 2;
    static final int VITESSE_NAGE_MAX = 10;
    static final int VITESSE_COURSE_MIN = 1;
    static final int VITESSE_COURSE_MAX = 4;

    public Pingouin(float poids, double vitesseNage, double vitesseCourse) throws CreationImpossible {
        super(poids);
        if (poids > 1 && poids <= 10) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer le pingouin, le poids n'est pas correct");
        if (VITESSE_NAGE_MIN < vitesseNage && vitesseNage < VITESSE_NAGE_MAX) this.vitesseNage = vitesseNage;
        else throw new CreationImpossible("Impossible de créer le pingouin, la vitesse de nage n'est pas correct");
        if (VITESSE_COURSE_MIN < vitesseCourse && VITESSE_COURSE_MAX > vitesseCourse) this.vitesseCourse = vitesseCourse;
        else throw new CreationImpossible("Impossible de créer le pingouin, la vitesse de course n'est pas correct");
    }

    public String toString() {
        return "Sait nager";
    }
    @Override
    public int getVitesseCourseMin() {
        return 0;
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
