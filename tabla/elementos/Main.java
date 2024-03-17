package tabla.elementos;
/**
 *
 * @author el legendario Grupo 3
 */
public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Elementos oxigeno = new NoMetales("Oxígeno","O",16,15.9994,3.4,"No Metal");
        Elementos mercurio = new Metales("Mercurio", "Hg",80 ,209.59, 2.00, "Metal de transición");
        inventario.anadirElemento(oxigeno);
        inventario.anadirElemento(mercurio);
        System.out.println(inventario);
    }
}
