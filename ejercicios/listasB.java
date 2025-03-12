import java.util.LinkedList;
import java.util.Scanner;

public class listasB {
    public static void miFuncion(int sec,LinkedList<String> lista){
        int contador = 0;
        String temp;
        String salida="";
        LinkedList<Integer> pos = new LinkedList<>();
        while(contador!=sec){
        for(int i = 1; i<lista.size();i++){
            if(lista.get(i-1).equals("B") && lista.get(i).equals("G")){
                pos.add(i);
            }
        }
        for(int i=0;i<pos.size();i++){
            temp = lista.get(pos.get(i)-1);
            lista.set(pos.get(i)-1, lista.get(pos.get(i)));
            lista.set(pos.get(i), temp);
        }
        pos.clear();
        contador++;
    }
    System.out.println(salida.join("", lista));
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        String[] prueba = inpt.nextLine().split(" ");
        String[] prueba_2 = inpt.nextLine().split("");
        int num = Integer.valueOf(prueba[0]);
        int sec = Integer.valueOf(prueba[1]);
        LinkedList<String> lista = new LinkedList<String>();
        for(int i=0; i<num;i++){
            lista.add(prueba_2[i]);
        }
        miFuncion(sec,lista);
    }
}