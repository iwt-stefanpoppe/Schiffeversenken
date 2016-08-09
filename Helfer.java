/**
 * Created by spoppe on 09.08.2016.
 */
public class Helfer {
    public int eingabenAuswerter(String eingabe) throws Exception {
        int result;
        String zahl;
        switch (eingabe.charAt(1)) {
            case 'A': result=Integer.parseInt(""+eingabe.charAt(2));
                break;
            case 'B': result=Integer.parseInt(""+eingabe.charAt(2)+7*1);
                break;
            case 'C': result=Integer.parseInt(""+eingabe.charAt(2)+7*2);
                break;
            case 'D': result=Integer.parseInt(""+eingabe.charAt(2)+7*3);
                break;
            case 'E': result=Integer.parseInt(""+eingabe.charAt(2)+7*4);
                break;
            case 'F': result=Integer.parseInt(""+eingabe.charAt(2)+7*5);
                break;
            case 'G': result=Integer.parseInt(""+eingabe.charAt(2)+7*6);
                break;
            default:throw new Exception(" Bitte geben sie nur Buchstaben von A bis G an!");
        }
        return result;
    }
}

