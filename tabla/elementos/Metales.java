package tabla.elementos;
public class Metales extends Elementos {
    protected String metal;
    public Metales(String nombre, String simbolo, int numeroAtomico, Double pesoAtomico
    , Double electronegatividad, String metal){
        super(nombre,simbolo,numeroAtomico,pesoAtomico,electronegatividad);
        this.metal = metal;
    }
}
