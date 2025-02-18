import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casosPrueba = scanner.nextInt(); 

        for (int i = 0; i < casosPrueba; i++) {
            int coposNieve = scanner.nextInt(); 
            
            TreeMap<Integer, Integer> coposMapa = new TreeMap<>(); 
            int maxUnicos = 0;
            int inicio = 0; 

            for (int j = 0; j < coposNieve; j++) {
                int copo = scanner.nextInt(); 

                
                if (coposMapa.containsKey(copo)) {
                    inicio = Math.max(inicio, coposMapa.get(copo) + 1); 
                }

                
                coposMapa.put(copo, j);

             
                maxUnicos = Math.max(maxUnicos, j - inicio + 1);
            }

            System.out.println(maxUnicos);
        }

        scanner.close();
    }
}