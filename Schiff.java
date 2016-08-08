/**
 * Created by spoppe on 04.08.2016.
 */
public class Schiff {
    int initial = (int) (Math.random() * 5);
    private int[] cellLocation = {initial, initial + 1, initial + 2};

    public String prüfDich(int spielerTipp) {
        String ergebnis = "Vorbei!";

        for (int i = 0; i < cellLocation.length; i++) {
            if (spielerTipp > 6 || spielerTipp < 0) {
                ergebnis = "Nur Tipps zwischen 0 und 6 sind erlaubt!";
                break;
            }
            if (spielerTipp == cellLocation[i]) {
                ergebnis = (treffer < 2) ? "Treffer!" : "Versenkt!";
                cellLocation[i] = 7;
                treffer++;
            }
        }
        return ergebnis;
    }


    public void setCellLocation(int[] locations) {

        cellLocation = locations;
    }

    private int treffer = 0;

    public int[] getCellLocation() {
        return cellLocation;
    }

    public int getTreffer() {

        return treffer;
    }

    public void setTreffer(int einTreffer) {
        treffer = einTreffer;
    }
}
