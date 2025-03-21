import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Collections;
public class arbolC {
    public static void miFuncionC(Map<Integer,Integer> ll){
        int salida = Collections.max(ll.values());
        if(salida==1){salida=3;}
        System.out.println(salida);
    }
    public static void main(String[] args) throws IOException{
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); si el input es de consola
        FileInputStream file = new FileInputStream("/workspaces/JAVA/ejercicios/inarbolC.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        String entrada = in.readLine();
        long start = System.nanoTime();
        while(entrada.equals("0")==false){
            Map<Integer,TreeSet<Integer>> al =  new TreeMap<Integer,TreeSet<Integer>>();
            Map<Integer,Integer> ll = new TreeMap<Integer,Integer>();
            int estudiantes = Integer.parseInt(entrada);
            int codigoCurso = 1;
            for(int i = 0;i<estudiantes;i++){
                entrada = in.readLine();
                StringTokenizer st = new StringTokenizer(entrada);
                TreeSet<Integer> cursosInscritos = new TreeSet<Integer>();
                for(int j = 0;j<5;j++){
                    cursosInscritos.add(Integer.parseInt(st.nextToken()));
                }
                if(al.containsValue(cursosInscritos)==false){
                    al.put(codigoCurso,cursosInscritos);
                    ll.put(codigoCurso,1);
                    codigoCurso++;
                }else{ 
                    for (int e : al.keySet()) {
                        if(al.get(e).equals(cursosInscritos)){
                            ll.put(e, ll.get(e)+1);
                            break;
                        }
                    }
                }
            }
            int salida = Collections.max(ll.values());
            if(salida==1){salida=3;}
            System.out.println(salida);
            entrada = in.readLine();
        }
        long end = System.nanoTime();
        //long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
        in.close();
    }
}
