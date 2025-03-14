import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class ListasE {
    public static void miFuncion(ArrayList<Integer> lista){
        int temp;
        String temp_2;
        String salida = "";
        ArrayList<String> letras = new ArrayList<String>();
        for(int i = 0; i<lista.size()-1;i++){
            for(int j = 1;j<lista.size();j++){
                if(lista.get(j)<lista.get(j-1)){
                    temp = lista.get(j);
                    lista.set(j,lista.get(j-1));
                    lista.set(j-1,temp);
                }
            }
        }
        for(int i = 0;i<lista.size();i++){
            letras.add(String.valueOf(lista.get(i)));
        }
        System.out.println(salida.join("+", letras));

    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();
        String[] entrada_1 = inpt.nextLine().split("\\+");
        for(int i = 0; i<entrada_1.length;i++){
            lista.add(Integer.valueOf(entrada_1[i]));
        }
        miFuncion(lista);
    }
}
// 1+1+3+1+3 3+2+1

