package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;
import com.afpa.www.interfaces.Courir;

public class Chevre extends Mammifere implements Courir {
    protected double vitesseCourse;
    static final int VITESSE_COURSE_MIN = 10;
    static final int VITESSE_COURSE_MAX = 50;
    public Chevre(float poids, double vitesseCourse) throws CreationImpossible {
        super(poids);
        if (poids > 1 && poids <= 100) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer la chèvre, le poids n'est pas correct");
        if (VITESSE_COURSE_MIN < vitesseCourse && VITESSE_COURSE_MAX > vitesseCourse) this.vitesseCourse = vitesseCourse;
        else throw new CreationImpossible("Impossible de créer la chèvre, la vitesse de course n'est pas correct");
    }
    @Override
    public String toString() {
        return "La chèvre sait courir";
    }
    @Override
    public int getvitesseMax() {
        return 0;
    }

    @Override
    public int getVitesseCourseMin() {
        return 0;
    }

}
