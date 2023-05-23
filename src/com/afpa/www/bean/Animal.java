package com.afpa.www.bean;


import com.afpa.www.interfaces.Deplacer;

public abstract class Animal {

    protected float poids;

    public Animal(float poids) {
        this.poids = poids;
    }

    public float getPoids() {
        return poids;
    }
}
