package org.example;

import Interface.Salarie;
import Model.Employe;
import Model.Equipe;

public class Main {
    public static void main(String[] args) {

        Equipe equipe = new Equipe();
        Equipe equipe2 = new Equipe();
        for(int i=0; i < 10; i++ ){
            equipe.getListSalarie().add(new Employe("Jean"+i,"Martin"+i));
        }for(int i=0; i < 10; i++ ){
            equipe2.getListSalarie().add(new Employe("Patrick"+i,"Martin"+i));
        }

        equipe.deplacement();
        equipe2.meeting();
    }
}