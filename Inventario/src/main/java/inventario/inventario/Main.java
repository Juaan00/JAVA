package inventario.inventario;
/**
 *
 * @author juanfelipequiroga
 */
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner input_1 = new Scanner(System.in);
        System.out.println("(1) - Ingresar - (2) - Consultar - (3) - Salir");
        System.out.println("Digite los datos usando el siguiente formato:");
        System.out.println("Opción&Tipo&Placa&Velocidad&Pasajeros&Color(Particular)/Tonelaje(Publico)");
        String entradaConsola = input_1.nextLine();
        if (entradaConsola.isBlank()){
            System.out.println("Por favor, ingrese un dato.");
            entradaConsola = input_1.next();
        }
        else{
            System.out.print("");
        }
    while (!entradaConsola.isEmpty()){
        if (entradaConsola.equals("1")){System.out.println("Ingrese los datos completos.");
                System.out.println("Opción&Tipo&Placa&Velocidad&Pasajeros&Color(Particular)/Tonelaje(Publico)");}
        else {
            if (entradaConsola.startsWith("1")){
                String[] elementos = entradaConsola.split("&");
                if (Objects.equals(elementos[1], "Publico")){
                    Publico dato_pu = new Publico(elementos[1],elementos[2],Double.parseDouble(elementos[3]),
                            Integer.parseInt(elementos[4]),elementos[5]);
                    inventario.addVehiculo(dato_pu);
                    System.out.println("Dato Ingresado");
                }
                else if (Objects.equals(elementos[1], "Particular")) {
                    Particular dato_pa = new Particular(elementos[1],elementos[2],Double.parseDouble(elementos[3]),
                            Integer.parseInt(elementos[4]),elementos[5]);
                    inventario.addVehiculo(dato_pa);
                    System.out.println("Dato Ingresado");
                }
                else{
                    System.out.println("Ingrese los datos como se indican:");
                    System.out.println("Opción&Tipo&Placa&Velocidad&Pasajeros&Color(Particular)/Tonelaje(Publico)");
                }
            }
            else if (entradaConsola.startsWith("2")){
                System.out.println("Datos ingresados: " + inventario.cantidadDeVehiculos());
                System.out.println(inventario.toString());

            }
            else if (entradaConsola.startsWith(("3"))){
                System.out.println("Programa Finalizado.");
                input_1.close();
                break;
            }
            else{
                System.out.println("Opción equivocada, por favor ingrese un dato valido");
                System.out.println();
            }
        }
        entradaConsola = input_1.next();
    }
    }
}
