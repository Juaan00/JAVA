import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static void miFuncion(ArrayList <Integer> lista){
        ArrayList <Integer> comb = new ArrayList<Integer>();
        int contador = 0;
        for(int i = lista.get(1);i<=lista.get(2);i++){
            comb.add(i);
        }

        for(int j = 1;j<=lista.get(0);j++){
            String num = String.valueOf(j);
            String [] digitos = num.split("");
            int sum = 0;
            for(int k = 0;k<digitos.length;k++){
                sum = sum + Integer.valueOf(digitos[k]);
            }
            if(comb.contains(sum)){
                contador = contador + j;
            }
        }
        System.out.println(contador);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList<>();
        Scanner inpt = new Scanner(System.in);
        String in1 = inpt.nextLine();
        String [] arr = in1.split(" ");
        for(int i =0; i<arr.length;i++){
            lista.add(Integer.valueOf(arr[i]));
        }
        miFuncion(lista);

    }
}