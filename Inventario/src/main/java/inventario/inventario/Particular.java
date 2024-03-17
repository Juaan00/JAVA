
package inventario.inventario;

public class Particular extends Vehiculo {
    protected String color;
    
    public Particular(String tipo, String placa, Double velocidad, int pasajeros, String color){
        super(tipo,placa,velocidad,pasajeros);
        this.color = color;   
    }
    public String getColor(){
        return color;
    }
    
}
