package inventario.inventario;
import java.util.ArrayList;
import java.util.List;

public class Inventario {

//    private List<Particular> vehiculos_pa = new ArrayList<>();
//
//    private List<Publico> vehiculos_pu = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
//    public void addVehiculo(Publico dato_pu) { this.vehiculos_pu.add(dato_pu);}
//    public void addVehiculo(Particular dato_pa){ this.vehiculos_pa.add(dato_pa); }

    public void addVehiculo(Vehiculo v){this.vehiculos.add(v);}

//    public Integer cantidadDeVehiculos(){return this.vehiculos_pa.size()+this.vehiculos_pu.size();}
    public Integer cantidadDeVehiculos(){return this.vehiculos.size();}
    
    @Override
    public String toString(){
        String salida = "";
        for (Vehiculo v: this.vehiculos){
            salida+= "Tipo: " + v.tipo + " | Placa: " + v.placa + " | Velocidad: "
                    + v.velocidad + " | Pasajeros: " + v.pasajeros + " | Tonelaje: "+ v.carga + " | Color: "+ v.color + "\n";
        }
//        for(Particular dato_pa: this.vehiculos_pa){
//            salida+= "Tipo: " + dato_pa.tipo + " | Placa: " + dato_pa.placa + " | Velocidad: "
//                    + dato_pa.velocidad + " | Pasajeros: " + dato_pa.pasajeros+ " | Color: " + dato_pa.color+"\n";
//        }
        return salida;

    }

    
}
