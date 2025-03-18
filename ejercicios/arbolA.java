import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.StringTokenizer;
public class arbolA {
    public static void miFuncionA(Map<String, Integer> al,int contador,int caso, int n){
        
        if(al.size()>0){
            // System.out.println("elementos del árbol: "+al+"\ncontador de elementos: "+contador);
            for (Map.Entry<String, Integer> e : al.entrySet()) {
                String k = e.getKey();
                double vd = (e.getValue()*100.0)/contador;
                String v = String.format("%.4f", vd);
                System.out.println(k + " " + v);
            }
            if(caso < n ){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream("/workspaces/JAVA/ejercicios/ejemplo.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int caso = -1;
        int contador = 0;
        Map<String,Integer> al = new TreeMap<String,Integer>();
        // System.out.println("Número de casos a estudiar: "+n);
        String elemento = in.readLine();
        while(elemento!=null){
            if(elemento.isBlank()){
                caso++;
                miFuncionA(al, contador,caso,n);
                al = new TreeMap<String,Integer>();
                contador = 0;
            } else{
                if(al.containsKey(elemento)){
                    al.replace(elemento, al.get(elemento)+1);
                }else{
                    al.put(elemento, 1);
                }
                contador++;
            }
            elemento = in.readLine();
        }
        caso++;
        miFuncionA(al, contador, caso,n);
        in.close();
}
}
