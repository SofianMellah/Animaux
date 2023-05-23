package com.afpa.www.test;

import com.afpa.www.bean.*;
import com.afpa.www.exception.CreationImpossible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    public void testViteFait() throws CreationImpossible {

        assertThrows(CreationImpossible.class, ()->new Truite(15, 5));

        /* Truite */
        try {
            Truite truite = new Truite(15, 5);
        } catch (CreationImpossible e){
            System.out.println(e);
        }
        /* Truite */


        /* Carpe */
        try {
            Carpe carpe = new Carpe(24,40);
        } catch (CreationImpossible e){
            System.out.println(e);
        }
        /* Carpe */


        /* Grenouille */
        try {
            Grenouille grenouille = new Grenouille(10,4,4);
        } catch (CreationImpossible e){
            System.out.println(e);
        }
        /* Grenouille */


        /* Chévre */
        try {
            Chevre chevre = new Chevre(50,68);
        } catch (CreationImpossible e){
            System.out.println(e);
        }
        /* Chévre */


        /* Chauve-souris */
        try {
            ChauveSouris chauveSouris = new ChauveSouris(0.4f,1.5,68);
            System.out.println(chauveSouris.getvitesseMax());
        } catch (CreationImpossible e){
            System.out.println(e);
        }
        /* Chauve-souris */


        /* Baleine */
        try {
            Baleine baleine = new Baleine(58000,30);
        } catch (CreationImpossible e){
            System.out.println(e);
        }
        /* Baleine */


        /* Mouette */
        try {
            Mouette mouette = new Mouette(0.8f,2,5,10);
        } catch (CreationImpossible e){
            System.out.println(e);
        }
        /* Mouette */


        /* Pingouin */
        try {
            Pingouin pingouin = new Pingouin(5,8,8);
        } catch (CreationImpossible e){
            System.out.println(e);
        }
    }
}
