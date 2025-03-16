import java.util.LinkedList;
import java.util.Scanner;

public class listasI {
    public static void miFuncionI(LinkedList<Integer> casos){
        int contador = 0;
        int delitos = 0;
        for(int elemento: casos){
            if(elemento>0){
                contador=contador+elemento;
            }else if(elemento==-1&&contador>0){
                contador--;
            }else{
                delitos++;
            }
        }
        System.out.println(delitos);
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        LinkedList<Integer> casos = new LinkedList<Integer>();
        int eventos = Integer.valueOf(inpt.nextLine());
        String[] lista = inpt.nextLine().split(" ");
        for(int i =0;i<eventos;i++){
            casos.add(Integer.valueOf(lista[i]));
        }
        miFuncionI(casos);
    }
}
/*

8
1 -1 1 -1 -1 1 1 1

3
-1 -1 1

11
-1 -1 2 -1 -1 -1 -1 -1 -1 -1 -1


 */
