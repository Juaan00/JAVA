import java.util.Scanner;
import java.util.LinkedList;
public class listasC {
    public static void miFuncion(int k, LinkedList<Integer> lista){
        LinkedList<Integer> lista_2 = new LinkedList<Integer>();
        for(int i =0;i<lista.size();i++){
            if(lista.get(i)>=lista.get(k)&&lista.get(i)!=0){
                lista_2.add(lista.get(i));
            }
        }
        System.out.println(lista_2.size());
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<Integer>();
        String[] entrada_1 = inpt.nextLine().split(" ");
        String[] entrada_2 = inpt.nextLine().split(" ");
        int n = Integer.valueOf(entrada_1[0]);
        int k = Integer.valueOf(entrada_1[1])-1;
        for(int i = 0;i<n;i++){
            lista.add(Integer.valueOf(entrada_2[i]));
        }
        miFuncion(k,lista);
    }
}
