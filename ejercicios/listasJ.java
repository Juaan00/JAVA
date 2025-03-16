import java.util.LinkedList;
import java.util.Scanner;

public class listasJ {
    public static void miFuncionJ(LinkedList<Integer> dir){
        dir.sort(null);
        int amigo1 = dir.get(0);
        int amigo2 = dir.get(1);
        int amigo3 = dir.get(2);
        int distancia = (amigo2-amigo1)+(amigo3-amigo2);
        System.out.println(distancia);
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        LinkedList<Integer> dir = new LinkedList<Integer>();
        String[] amigos = inpt.nextLine().split(" ");
        for(String amigo: amigos){
            dir.add(Integer.valueOf(amigo));
        }
        miFuncionJ(dir);
    }
} 

