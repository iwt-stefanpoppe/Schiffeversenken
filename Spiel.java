/**
 * Created by spoppe on 04.08.2016.
 */

import javax.swing.*;


public class Spiel {
    public static final int SPIELVORBEI = 3;

    public static void Schiffeversenken() {
        System.out.println("Versenken sie das Schiff! Es liegt irgendwo zwischen Position 0 und 6.\n");
        Schiff dotCom = new Schiff();
        int orte[] = dotCom.getCellLocation();
        String ausruf = "0";
        int zähler=0;


        while (dotCom.getTreffer() < SPIELVORBEI) {
             ausruf= dotCom.prüfDich(Integer.parseInt(JOptionPane.showInputDialog("Auf welcher Stelle befindet sich das DotCom?")));
            // Austauschbar durch intAbfrager im Ratespiel !
            System.out.println(ausruf);
            zähler++;
            }



        System.out.println("\nHerzlichen Glückwunsch! Sie haben das Schiff in " + zähler + " Versuchen versenkt!");
    }
}
