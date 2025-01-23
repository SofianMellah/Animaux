package com.afpa.www.main;


import com.afpa.www.bean.Truite;
import com.afpa.www.exception.CreationImpossible;

public class Main {
    public static void main(String[] args) throws CreationImpossible {
        System.out.println("Bonjour");
        Truite truite = new Truite(5,5);
        System.out.println(truite);
        System.out.println(truite);
    }
}