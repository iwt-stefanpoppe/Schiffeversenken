import java.util.ArrayList;

/**
 * Created by spoppe on 04.08.2016.
 */
public class Schiff {
    private ArrayList<String> cellLocation = new ArrayList<>();
    private String name;
    private int treffer = 0;
    private boolean überWasser = true;
    Helfer helfer = new Helfer();

    public boolean prüfDich(String spielerTipp) {

        int spielerTippInt = 0;

        spielerTipp = helfer.eingabenAuswerter(spielerTipp);
        spielerTippInt = Integer.parseInt(spielerTipp);
        if (spielerTippInt < 0 || spielerTippInt > 49) {
            System.out.println("Bitte geben sie eine Kombination aus Buchstabe von A-G und Zahl von 0-6 ein! (z.B C6)");
        }


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

        int initial = (int) (Math.random() * 47);
        for (int i = 0; i < Spiel.SPIELVORBEI; i++) {
            String stringInitial = "" + initial;
            cellLocation.add(stringInitial);
            initial++;
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
