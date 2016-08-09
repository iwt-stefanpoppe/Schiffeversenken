/**
 * Created by spoppe on 04.08.2016.
 */

import javax.swing.*;
import java.util.ArrayList;


public class Spiel {
    public static final int SPIELVORBEI = 3;

    public static void Schiffeversenken() {
        System.out.println("Versenken sie das Schiff! Es liegt irgendwo zwischen Position 0 und 6 \n");


        ArrayList<Schiff> schiffListe = new ArrayList<>();
        Schiff weser = new Schiff("Weserkrone");
        Schiff black = new Schiff("Black Pearl");
        Schiff gorch = new Schiff("Gorch Fock");
        schiffListe.add(weser);
        schiffListe.add(black);
        schiffListe.add(gorch);


        int zähler = 0;

        boolean getroffen;

        while (!schiffListe.isEmpty()) {
            String benutzerEingabe = JOptionPane.showInputDialog("Auf welche Stelle wollen sie schießen?");
            int trefferZähler = 0;
            for(int i =0;i<schiffListe.size();i++) {

                getroffen = schiffListe.get(i).prüfDich(benutzerEingabe);
                if(getroffen){trefferZähler++;}
                if (!schiffListe.get(i).isÜberWasser()){
                    schiffListe.remove(i);
                }
            }
            if(trefferZähler==0){System.out.println("Verfehlt!");}
            zähler++;
        }

        System.out.println("\nHerzlichen Glückwunsch! Sie haben die Schiffe in " + zähler + " Versuchen versenkt!");
    }
}

