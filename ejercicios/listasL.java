import java.util.ArrayList;
import java.util.Scanner;

public class listasL {
    public static void miFuncionL(ArrayList<Integer> intentos, int n, int k){
        int equipos = 0;
        ArrayList<Integer> participantes = new ArrayList<Integer>();
        for(int i = 0;i<intentos.size();i++){
            if(intentos.get(i)+k<6){
                participantes.add(intentos.get(i));
            }
        }
        equipos = participantes.size()/3;
    System.out.println(equipos);
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        ArrayList<Integer> intentos = new ArrayList<Integer>();
        String[] entrada1 = inpt.nextLine().split(" ");
        String[] entrada2 = inpt.nextLine().split(" ");
        int n = Integer.valueOf(entrada1[0]);
        int k = Integer.valueOf(entrada1[1]);
        for(String elemento: entrada2){
            intentos.add(Integer.valueOf(elemento));
        }
        miFuncionL(intentos,n,k);
    }
}/*5 2
0 4 5 1 0
6 4
0 1 2 3 4 5
6 5
0 0 0 0 0 0
 */
