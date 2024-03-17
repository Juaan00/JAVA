package inventario.inventario;

public class Publico extends Vehiculo {
    protected String carga;
    
    public Publico (String tipo, String placa, Double velocidad, int pasajeros, String carga){
        super(tipo,placa,velocidad,pasajeros);
        this.carga = carga;
    }

    
}
