package com.afpa.www.bean;

import com.afpa.www.exception.CreationImpossible;
import com.afpa.www.interfaces.Courir;
import com.afpa.www.interfaces.Voler;

public class ChauveSouris extends Mammifere implements Courir, Voler {
    protected double vitesseCourse;
    protected double vitesseVol;
    static final int VITESSE_VOL_MIN = 20;
    static final int VITESSE_VOL_MAX = 60;
    static final int VITESSE_COURSE_MIN = 1;
    static final int VITESSE_COURSE_MAX = 2;

    public ChauveSouris(float poids, double vitesseCourse, double vitesseVol) throws CreationImpossible{
        super(poids);
        if (poids > 0.1 && poids <= 0.5) this.poids = poids;
        else throw new CreationImpossible("Impossible de créer la chauve-souris, le poids n'est pas correct");
        if (VITESSE_COURSE_MIN < vitesseCourse && vitesseCourse < VITESSE_COURSE_MAX) this.vitesseCourse = vitesseCourse;
        else throw new CreationImpossible("Impossible de créer la chauve-souris, la vitesse de course n'est pas correct");
        if (VITESSE_VOL_MIN < vitesseVol && vitesseVol < VITESSE_VOL_MAX) this.vitesseVol = vitesseVol;
        else throw new CreationImpossible("Impossible de créer la chauve souris, la vitesse de vol n'est pas correct");
    }
    public String toString() {
        return "La chauve-souris sait courir et voler";
    }
    @Override
    public int getvitesseMax() {
        return VITESSE_COURSE_MAX;
    }
    @Override
    public int getVitesseCourseMin() {
        return VITESSE_COURSE_MIN;
    }
    @Override
    public int getVitesseVolMin() {
        return VITESSE_VOL_MIN;
    }

}
