/**
 * Created by spoppe on 09.08.2016.
 */
public class Helfer {
    public String eingabenAuswerter(String eingabe) {
        String result;
        char ersteStelle =eingabe.charAt(0);
        int x = Character.getNumericValue(eingabe.charAt(1));
        if (x<0||6<x){
            result = "77";
            return result;
        }
        switch (ersteStelle) {
            case 'A': result=""+x;
                break;
            case 'B': result=""+(x+7*1);
                break;
            case 'C': result=""+(x+7*2);
                break;
            case 'D': result=""+(x+7*3);
                break;
            case 'E': result=""+(x+7*4);
                break;
            case 'F': result=""+(x+7*5);
                break;
            case 'G': result=""+(x+7*6);
                break;
            default:result="77";
        }
        return result;
    }
}

