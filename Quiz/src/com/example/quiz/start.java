package com.example.quiz;

import easyIO.*;

/**
 * Created by Martin on 28.08.2014.
 */
public class start {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();
        int poeng = 0;

        skjerm.outln("The Almost-Ultimate Quiz");
        skjerm.outln();


        skjerm.out("Hva er hovedstaden i Japan?: ");
        String hovedstad = tast.inLine();
        if (hovedstad.equals("Tokyo")) {  //Sammenligner string variabelen med brukers svar
            skjerm.outln("Korrekt");
            poeng++;
        }
        else if (hovedstad.equals("tokyo")) {
            skjerm.outln("Korrekt");
            poeng++;
        }
        else {
            skjerm.outln("Svaret er ikke korrekt");
        }
        skjerm.outln();


        skjerm.out("Hvor mange spørsmål har du svart på hittil?: ");
        int sporsmaal = tast.inInt();
        if (sporsmaal == 1) {
            skjerm.outln("Korrekt");
            poeng++;
        }
        else {
            skjerm.outln("Seriøst?");
            poeng++;
        }
        skjerm.outln();


        skjerm.out("Hva heter kongen av Norge?: ");
        String kongen = tast.inLine();
        if (kongen.equals("Harald")) {
            skjerm.outln("Korrekt");
            poeng++;
        }
        else if (kongen.equals("harald")) {
            skjerm.outln("Korrekt");
            poeng++;
        }
        else {
            skjerm.outln("Dårligt");
        }
        skjerm.outln();


        skjerm.out("Hva er hundens latinske navn?: ");
        String latin = tast.inLine();
        if (latin.equals("Canis Lupus Familiaris")) {
            skjerm.outln("Meget bra");
            poeng++;
            poeng++;
        }
        else if (latin.equals("canis lupus familiaris")) {
            skjerm.outln("Meget bra");
            poeng++;
            poeng++;
        }
        else {
            skjerm.outln("Close, but no cigar, more like completely opposite direction of it");
        }
        skjerm.outln();


        skjerm.outln("Hva heter HiB på engelsk?: ");
        String hib = tast.inLine();
        if (hib.equals("Bergen University College")) {
            skjerm.outln("Korrekt");
        }
        else if (hib.equals("bergen university college")) {
            skjerm.outln("Korrekt");
            poeng++;
        }
        else {
            skjerm.outln("Dårligt");

        }
        skjerm.outln();


        skjerm.outln("Din totale poengsum er " + poeng + " ut av maks 6");
        skjerm.outln();
        if (poeng <= 6){
            skjerm.outln("Full pott, you make me proud son");
        }
        else if (poeng <= 4) {
            skjerm.outln("Du kan sikker gjøre bedre, kanskje");
        }




    }
}
