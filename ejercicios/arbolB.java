import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.TreeMap;

public class arbolB {
    public static void miFuncionB(Map <String, Integer> al){
        int contador = 0;
        for (Map.Entry<String, Integer> e : al.entrySet()) {
            if(e.getValue()>1){
                contador++;
            }
        }
        System.out.println(contador);
    }
    public static void main(String[] args) throws IOException{
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); si el input es de consola
        FileInputStream file = new FileInputStream("/workspaces/JAVA/ejercicios/inarbolB.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        String entrada = in.readLine();
        while(entrada!=null){
            if(entrada.equals("0 0")){
                entrada = in.readLine();
            }else{
            StringTokenizer st = new StringTokenizer(entrada);
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            Map<String, Integer> al = new TreeMap<String,Integer>();
            for(int i=0;i<n1+n2;i++){
                entrada = in.readLine();
                if(al.containsKey(entrada)){
                    al.put(entrada, al.get(entrada)+1);
                }
                else{
                    al.put(entrada, 1);
                }
            }
            miFuncionB(al);
            entrada = in.readLine();
        }
        }
        in.close();
    }
}
