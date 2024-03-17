
package inventario.inventario;

public abstract class Vehiculo {
    
    protected String tipo;
    protected String placa;
    protected Double velocidad;
    protected int pasajeros;

    public Particular color;

    public Publico carga;

    public Vehiculo(String tipo, String placa, Double velocidad, int pasajeros){
        this.tipo = tipo;
        this.placa = placa;
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
        this.color = color;
        this.carga = carga;
    }
    
}
