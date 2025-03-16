import java.util.ArrayList;
import java.util.Scanner;

public class listasH {
    public static void miFuncion(ArrayList<Integer> lista,int niveles){
        boolean pasamos = true;
        for(int i = 1; i<=niveles;i++){
            if(lista.contains(i)==false){
                pasamos = false;
                break;
            }
        }
        if(niveles==0){
            pasamos = false;
        }
        if(pasamos == true){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner inpt = new Scanner(System.in);
        int niveles = Integer.valueOf(inpt.nextLine());
        String[] jugador1 = inpt.nextLine().split(" ");
        String[] jugador2 = inpt.nextLine().split(" ");
        for(int i = 0;i<jugador1.length;i++){
            lista.add(Integer.valueOf(jugador1[i]));
        }
        for(int i = 0;i<jugador2.length;i++){
            lista.add(Integer.valueOf(jugador2[i]));
        }
        miFuncion(lista, niveles);
    }
}/*
4
3 1 2 3 0
2 2 4
Oh, my keyboard!
10
0 3 2 5 1 8
2 4 2 9 7 9 10
15
3 5 2 8 10 15 13 6 9 13
4 8 6 12 14 11 15 1 7

4
3 1 2 3
2 2 3

*/
