package tabla.elementos;
public class NoMetales extends Elementos {
    protected String noMetal;
    public NoMetales(String nombre, String simbolo, int numeroAtomico, Double pesoAtomico
    , Double electronegatividad, String noMetal){
        super(nombre,simbolo,numeroAtomico,pesoAtomico,electronegatividad);
        this.noMetal = noMetal;
    }
}
