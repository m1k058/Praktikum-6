
/**
 * Repr�sentationen f�r alle g�ltigen Befehlsw�rter des Spiels,
 * zusammen mit einer Zeichenkette in einer bestimmten Sprachen.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 31.07.2011
 */
public enum Befehlswort
{
    // Ein Wert f�r jedes Befehlswort, plus eines f�r nicht
    // erkannte Befehle
    GO("gehe"),DRIVE("fahre"), QUIT("verlassen"), HELP("hilfe"), BUILD("baue"), PICKUP("nehme"), UNKNOWN("?");
    
    // Das Befehlswort als Zeichenkette.
    private String befehlswort;
    
    /**
     * Initialisieren mit dem entsprechenden Befehlswort.
     * @param befehlswort das Befehlswort als Zeichenkette.
     */
    Befehlswort(String befehlswort)
    {
        this.befehlswort = befehlswort;
    }
    
    /**
     * @return das Befehlswort als Zeichenkette.
     */
    public String toString()
    {
        return befehlswort;
    }
}
