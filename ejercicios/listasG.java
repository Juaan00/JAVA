import java.util.ArrayList;
import java.util.Scanner;

public class listasG {
    public static void miFuncion(ArrayList<Integer> lista,double n){
        double contador = 0;
        double temp;
        for(int i = 0;i<lista.size();i++){
            temp = lista.get(i);
            contador = contador + (temp/100.0);
        }
        contador = (contador*100.0)/n;
        System.out.println(contador);
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int n = Integer.valueOf(inpt.nextLine());
        String[] in_2 = inpt.nextLine().split(" ");
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            lista.add(Integer.valueOf(in_2[i]));
        }
        miFuncion(lista,n);
    }
}
