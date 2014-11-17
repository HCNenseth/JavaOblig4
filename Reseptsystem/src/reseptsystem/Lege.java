
package reseptsystem;

/**
 *
 * @author HansChristian
 */
public class Lege extends Person {
    public String lege_adr;
    public String lege_tlf;
    public Boolean lisens = true;
    public Resept[] resepter;
    private static final int MAX_RESEPTER = 100;
    private int ant_resepter;
    
    public Lege(){
        
    }
}
