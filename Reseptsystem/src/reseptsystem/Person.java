
package reseptsystem;

public class Person {

    private String navn;
    private String fødselsdato;
    
    public Person(String n, String f){
        navn = n;
        fødselsdato = f;
    }

    public String getNavn() {
            return navn;
    }
    
    public String getFdato(){
        return fødselsdato;
    }
    
    public String toString() {
        String utskrift = "Navn " + navn + "og fødselsdato" + fødselsdato;
        return utskrift;
    }
}
