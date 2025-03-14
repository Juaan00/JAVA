import java.util.ArrayList;
import java.util.Scanner;
public class listasD {
    public static int mCentrar(ArrayList<ArrayList<Integer>> matriz, int contador){
        int columna = 0;
        ArrayList<Integer> temp;
        for(int i = 0; i<matriz.size();i++){
            if(matriz.get(i).contains(1)){
                columna = i;
                break;
            }
        }
        //System.out.println("Posición de columna: "+columna);
        //System.out.println("Posición de 1: "+matriz.get(columna).indexOf(1));
        if(matriz.get(columna).indexOf(1)<2){
            contador = 2 - matriz.get(columna).indexOf(1);
        } else if(matriz.get(columna).indexOf(1)>2){
            contador = matriz.get(columna).indexOf(1) - 2;
        }
        //matriz.get(columna).set(matriz.get(columna).indexOf(1), 0);
        //matriz.get(columna).set(2,1);
        if(columna<2){
            contador = contador + (2 - columna);
        } else if (columna>2){
            contador = contador + (columna-2);
        }
        temp = matriz.get(2);
        //matriz.set(2, matriz.get(columna));
        //matriz.set(columna, temp);

        return contador;
    }
    public static void miFuncion(ArrayList<ArrayList<Integer>> matriz){
        int contador = 0;
        contador = mCentrar(matriz,contador);
        //for(int i = 0;i<matriz.size();i++){
        //    System.out.println(matriz.get(i));
        //}
        System.out.println(contador);
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<5;i++){
            String[] entrada = inpt.nextLine().split(" ");
            ArrayList<Integer> fila = new ArrayList<Integer>();
            for(int j = 0; j<entrada.length;j++){
                fila.add(Integer.valueOf(entrada[j]));
            }
            matriz.add(fila);
        }
        miFuncion(matriz);
    }
}
/*
1 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 1 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
 */
