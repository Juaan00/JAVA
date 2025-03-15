import java.util.ArrayList;
import java.util.Scanner;

public class listasF{
    public static void miFuncion(ArrayList<Integer> lista){
        ArrayList<String> pos = new ArrayList<String>();
        String salida = "";
        for(int i=0;i<lista.size();i++){
            pos.add(String.valueOf(lista.indexOf(i+1)+1));
        }
        System.out.println(salida.join(" ", pos));
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int n = Integer.valueOf(inpt.nextLine());
        String[] entrada_2 = inpt.nextLine().split(" ");
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0;i<n;i++){
            lista.add(Integer.valueOf(entrada_2[i]));
        }
        miFuncion(lista);
    }
}
/*
4
2 3 4 1 = 4 1 2 3
3
1 3 2 = 1 3 2
2
1 2
 */