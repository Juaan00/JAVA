package tabla.elementos;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Elementos> elementos = new ArrayList<>();
    
    public void anadirElemento(Elementos e){
        this.elementos.add(e);
    }
    
    @Override
    public String toString(){
        String salida = "";
        for(Elementos e: this.elementos){
            if (e instanceof Metales){
                Metales a = (Metales) e;
                salida +="Nombre: "+ a.nombre + " | Simbolo: " + a.simbolo + " | Número Atómico: " 
                    + a.numeroAtomico + " | Peso Atómico: " + a.pesoAtomico + " | Electronegatividad: " 
                    + a.electronegatividad + " | Categoria: " + a.metal + "\n";
            }
            else if (e instanceof NoMetales){
                NoMetales b = (NoMetales) e;
                salida +="Nombre: "+ b.nombre + " | Simbolo: " + b.simbolo + " | Número Atómico: " 
                    + b.numeroAtomico + " | Peso Atómico: " + b.pesoAtomico + " | Electronegatividad: " 
                    + b.electronegatividad + " | Categoria: " + b.noMetal + "\n";
            }
        }
        return salida;
    }
}
