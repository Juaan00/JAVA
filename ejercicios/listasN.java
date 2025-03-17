import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class listasN {
    public static void miFuncionN(List<Integer> l){
        List<Integer> grupo = new ArrayList<Integer>();
        int contador = 1;
        int cantidadGrupos = 0;
        while(l.size()>0){
            for(int i =0;i<l.size();i++){
                if(l.get(i)==contador){
                    grupo.add(i+1);
                    l.set(i, 0);
                    contador++;
                    break;
                }
            }
            if(contador==4){contador=1; cantidadGrupos++;}
            if(l.contains(contador)==false){break;}
        }
        System.out.println(cantidadGrupos);
        while(cantidadGrupos>0){
            ArrayList<String> gruposLista = new ArrayList<String>();
            for(int i = 0;i<3;i++){
                gruposLista.add(String.valueOf(grupo.get(i)));
            }
            for(int k =2;k>=0;k--){grupo.remove(k);}
            String salida = String.join(" ", gruposLista);
            System.out.println(salida);
            cantidadGrupos--;
        }
    }
    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());
    int grupos = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(in.readLine());
    List<Integer> al = new ArrayList<>();
    for(int i=0; i<grupos; i++) al.add(Integer.parseInt(st.nextToken()));
    miFuncionN(al);
}
}