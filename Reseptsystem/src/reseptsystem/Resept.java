
package reseptsystem;

/**
 *
 * @author HansChristian
 */
public class Resept {

    private boolean utlevert = false;
    private String tekst;
    private Calendar dato;
    private Pasient pasient;
    private Lege lege;
    private int nr;
    private static int nesteNr = 0;

//    < Konstruktøren mottar reseptens tekst , legen og pasienten som parametre.
//    Resepten blir tildelt et unikt nummer, datoen for opprettelsen av resepten blir registert , i tillegg til at annen nødvendig initialisering
//    blir foretatt. >

//  < get-metoder for datafeltene nr og utlevert>

  public void registrerUtlevert() {
//        < Metoden  registrerer at den medisinen resepten foreskriver er utlevert. >
    }

    public String toString() {
//        < Metoden  returnerer en tekst som innholder all informasjon på resepten,
//                samt opplysninger om medisinen resepten foreskriver er utlevert ellerikke. >
    }

}
