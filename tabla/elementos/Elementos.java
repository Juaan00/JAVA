package tabla.elementos;
public abstract class Elementos {
    
    protected String nombre;
    protected String simbolo;
    protected int numeroAtomico;
    protected Double pesoAtomico;
    protected Double electronegatividad;
    
    public Elementos(String nombre, String simbolo, int numeroAtomico, Double pesoAtomico
    , Double electronegatividad){
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
        this.pesoAtomico = pesoAtomico;
        this.electronegatividad = electronegatividad;
    }
}
