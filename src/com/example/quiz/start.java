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
        }
        else {
            skjerm.outln("Seriøst?");
        }
        skjerm.outln();


        skjerm.out("Hva heter kongen av Norge?: ");
        String kongen = tast.inLine();
        if (kongen.equals("Harald")) {
            skjerm.outln("Korrekt");
        }
        else if (kongen.equals("harald")) {
            skjerm.outln("Korrekt");
        }
        else {
            skjerm.outln("Dårligt");
        }
        skjerm.outln();


        skjerm.out("Hva er hundens latinske navn?: ");
        String latin = tast.inLine();
        if (latin.equals("Canis Lupus Familiaris")) {
            skjerm.outln("Meget bra");
        }
        else if (latin.equals("canis lupus familiaris")) {
            skjerm.outln("Meget bra");
        }
        else {
            skjerm.outln("Close, but no cigar, more like completely opposite direction of it");
        }
        skjerm.outln();


        skjerm.outln("Hva heter kongen av Norge?: ");
        String kongen = tast.inLine();
        if (kongen.equals("Harald")) {
            skjerm.outln("Korrekt");
        }
        else if (kongen.equals("harald")) {
            skjerm.outln("Korrekt");
        }
        else {
            skjerm.outln("Dårligt");
        }
        skjerm.outln();



    }
}
