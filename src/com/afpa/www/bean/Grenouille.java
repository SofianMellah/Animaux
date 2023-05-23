package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;

public class Grenouille extends Amphibien{

    static final int VITESSE_NAGE_MIN = 1;
    static final int VITESSE_NAGE_MAX = 5;
    static final int VITESSE_COURSE_MIN = 2;
    static final int VITESSE_COURSE_MAX = 5;
    public Grenouille(float poids, double vitesseNage, double vitesseCourse) throws CreationImpossible{
        super(poids, vitesseNage, vitesseCourse);
        if (poids > 0.1 && poids <= 1) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer la grenouille, le poids n'est pas correct");
        if (VITESSE_NAGE_MIN < vitesseNage && VITESSE_NAGE_MAX > vitesseNage) this.vitesseNage = vitesseNage;
        else throw new CreationImpossible("Impossible de créer la grenouille, la vitesse de nage n'est pas correct");
        if (VITESSE_COURSE_MIN < vitesseCourse && VITESSE_COURSE_MAX > vitesseCourse) this.vitesseCourse = vitesseCourse;
        else throw new CreationImpossible("Impossible de créer la grenouille, la vitesse de course n'est pas correct");
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
    public int getVitesseCourseMin() {
        return 0;
    }
}
