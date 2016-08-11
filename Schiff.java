import java.util.ArrayList;

/**
 * Created by spoppe on 04.08.2016.
 */
public class Schiff {
    private ArrayList<String> cellLocation = new ArrayList<>();
    private String name;
    private int treffer = 0;
    private boolean überWasser = true;
    private boolean waagerecht = true;

    public boolean prüfDich(String spielerTipp) {

        int spielerTippInt = 0;

        boolean getroffen = false;


        if (cellLocation.contains(spielerTipp)) {
            int indexDesTreffers = cellLocation.indexOf(spielerTipp);
            cellLocation.remove(indexDesTreffers);
            String ergebnis = !(cellLocation.isEmpty()) ? "Treffer auf der " + name + "!" : "Die " + name + " wurde versenkt!";
            treffer++;
            if (treffer == 3) {
                überWasser = false;
            }
            System.out.println(ergebnis);
            getroffen = true;
        }
        return getroffen;

    }

    public Schiff(String name) {
        this.name = name;
        int initial=0;
        do{initial = (int) (Math.random() * 47);}while (initial ==40||initial==41);

        if (initial < 35) {
            int waagerechtBestimmer = (int) (Math.random() * 2);
            if (waagerechtBestimmer == 0) {
                waagerecht = false;
            }
        }
        for (int i = 0; i < 7; i++) {
            if (initial == (5 + 7 * i) || initial == (6 + 7 * i)) {
                waagerecht = false;
            }
        }

        for (int j = 0; j < Spiel.SPIELVORBEI; j++) {
            String stringInitial = "" + initial;
            cellLocation.add(stringInitial);
            initial = waagerecht ? initial + 1 : initial + 7;
        }
    }


    public boolean isÜberWasser() {
        return überWasser;
    }

    public void setÜberWasser(boolean überWasser) {
        this.überWasser = überWasser;
    }

    public int getTreffer() {

        return treffer;
    }

    public void setTreffer(int einTreffer) {
        treffer = einTreffer;
    }

    public ArrayList<String> getCellLocation() {
        return cellLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
