import javax.swing.ImageIcon;

/**
 * Ein Raum, der ein Bild enthaelt.
 */
public class BildRaum extends Raum
{
    private ImageIcon bild;

    /**
     * Erzeuge einen BildRaum einer Kategorie und lade das Bild.
     */
    public BildRaum(Raumkategorie kategorie, String filename)
    {
        super(kategorie);
        bild = new ImageIcon(filename);
    }

    /**
     * Gibt das geladene Bild zurueck.
     *
     * @return  das Bild dieses Raumes
     */
    public ImageIcon getImage()
    {
        return bild;
    }
}
