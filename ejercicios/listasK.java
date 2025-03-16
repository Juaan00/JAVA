import java.util.ArrayList;
import java.util.Scanner;
public class listasK {
    public static void miFuncionK(ArrayList<Integer> marcadorL){
        int referencia = marcadorL.get(0);
        int menor = referencia;
        int mayor = referencia;
        int contador = 0;
        for(int i = 1;i<marcadorL.size();i++){
            if(marcadorL.get(i)<menor){
                menor = marcadorL.get(i);
                contador++;
            }else if(marcadorL.get(i)>mayor){
                mayor = marcadorL.get(i);
                contador++;
            }
        }
        System.out.println(contador);
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        ArrayList<Integer> marcadorL = new ArrayList<Integer>();
        int num = Integer.valueOf(inpt.nextLine());
        String[] marcador = inpt.nextLine().split(" ");
        for(String intento: marcador){
            marcadorL.add(Integer.valueOf(intento));
        }
        miFuncionK(marcadorL);
    }
} //10
//4664 6496 5814 7010 5762 5736 6944 4850 3698 7242
