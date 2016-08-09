/**
 * Created by spoppe on 04.08.2016.
 */

import javax.swing.*;


public class Spiel {
    public static final int SPIELVORBEI = 3;

    public static void Schiffeversenken() {
        System.out.println("Versenken sie das Schiff! Es liegt irgendwo zwischen Position 0 und 6.\n");
        Schiff weser = new Schiff("Weserkrone");
        Schiff black = new Schiff("Black Pearl");
        Schiff gorch = new Schiff("Gorch Fock");

        int zähler = 0;

        boolean a;
        boolean b;
        boolean c;

        while (gorch.isÜberWasser() || weser.isÜberWasser() || black.isÜberWasser()) {
            String benutzerEingabe = JOptionPane.showInputDialog("Auf welche Stelle wollen sie schießen?");

            a = weser.prüfDich(benutzerEingabe);
            b = black.prüfDich(benutzerEingabe);
            c = gorch.prüfDich(benutzerEingabe);


            if (!a && !b && !c) {
                System.out.println("Verfehlt!");
            }

            zähler++;
        }

        System.out.println("\nHerzlichen Glückwunsch! Sie haben das Schiff in " + zähler + " Versuchen versenkt!");
    }
}
