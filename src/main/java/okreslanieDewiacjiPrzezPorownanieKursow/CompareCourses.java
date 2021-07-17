package okreslanieDewiacjiPrzezPorownanieKursow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareCourses implements Methods {
    Scanner sc = new Scanner(System.in);
    double ccn, ccne, cce, ccse, ccs, ccsw, ccw, ccnw;
    double d;
    double DEVn, DEVne, DEVe, DEVse, DEVs, DEVsw, DEVw, DEVnw;

    @Override
    public void introduction() {
        System.out.println("\nProgram is using the Archibald-Smith’s formula to derive a deviation table from deviation observations at eight major rates." +
                "\nWe are going to use below patterns: " + "\n" +
                "\nCerr = TC - CC" +
                "\nDev = Cerr - d\n" + "\n" + "Where: " +
                "\nDev - Magnetic Deviation" +
                "\nTC - True Course" +
                "\nCC - Compass Course" +
                "\nCerr - Compass error" +
                "\nd - variation (taken from sea chart)");

    }
    // TODO - NAJLEPIEJ GDYBY TA METODA WYKONYWALA SIE TYLKO RAZ??!!

    @Override
    public void insertVariation() {
        try {
            System.out.println("Insert value of variation: ");
            d = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + " Wrong imput. Insert numbers not text");
        }
    }
    //TODO - regex dla przecinka ',' - poprawnie, kropka '.' - nie poprawnie
    //TODO - zrobic aby metoda odpalala sie ponownie, mimo wprowadzonej zlej wartosci

    @Override
    public void insertCompasCourses() {
        try {
            System.out.println("\nInsert Compas Course for each cardinal course: ");
            System.out.println("CC for " + TrueCourses.N + " TC: ");
            ccn = sc.nextDouble();
            System.out.println("CC for " + TrueCourses.NE +" TC: ");
            ccne = sc.nextDouble();
            System.out.println("CC for " + TrueCourses.E + " TC: ");
            cce = sc.nextDouble();
            System.out.println("CC for " + TrueCourses.SE + " TC: ");
            ccse = sc.nextDouble();
            System.out.println("CC for " + TrueCourses.S + " TC: ");
            ccs = sc.nextDouble();
            System.out.println("CC for " + TrueCourses.SW + " TC: ");
            ccsw = sc.nextDouble();
            System.out.println("CC for " + TrueCourses.W + " TC: ");
            ccw = sc.nextDouble();
            System.out.println("CC for " + TrueCourses.NW + " TC: ");
            ccnw = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + " Wrong imput. Insert numbers not text");
        }
    }
    //TODO - SPROBOWAC ZROBIC TO W PETLI, A NIE RECZNIE
    //TODO - mozna wprowadzic max 3 znaki od 0-9 !!!

    @Override
    public void calculateDeviationForCardinalCourses() {
        DEVn = (TrueCourses.N.value - ccn) - d;
        DEVne = (TrueCourses.NE.value - ccne) - d;
        DEVe = (TrueCourses.E.value - cce) - d;
        DEVse = (TrueCourses.SE.value - ccse) - d;
        DEVs = (TrueCourses.S.value - ccs) - d;
        DEVsw = (TrueCourses.SW.value - ccsw) - d;
        DEVw = (TrueCourses.W.value - ccw) - d;
        DEVnw = (TrueCourses.NW.value - ccnw) - d;
    }
    //TODO - TAK JAK W ENUM, MUSZE ZAMIENISC WARTOSCI NA STOPNIE, a przynajmniej zaokraglic wyniki...

    @Override
    public void displayDeviationForCardinalCourses() {
        System.out.println("Deviation for eight cardinal courses: ");
        System.out.println(TrueCourses.N + " = " + DEVn);
        System.out.println(TrueCourses.NE + " = " + DEVne);
        System.out.println(TrueCourses.E + " = " + DEVe);
        System.out.println(TrueCourses.SE + " = " + DEVse);
        System.out.println(TrueCourses.S + " = " + DEVs);
        System.out.println(TrueCourses.SW + " = " + DEVsw);
        System.out.println(TrueCourses.W + " = " + DEVw);
        System.out.println(TrueCourses.NW + " = " + DEVnw);
    }
}