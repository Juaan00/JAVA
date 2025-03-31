import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static <T> void miFuncionX(List<T> al) {
        System.out.println(al);
        ArrayList<Integer> ll = new ArrayList<Integer>();
        for(int i=0;i<al.size();i++) ll.add(0);
        System.out.println(ll);
        for(int i=0;i<al.size();i++){
            T temp = al.get(i);
            ll.set(i,1);
            int contador = 0;
            for(int j=i+1;j<al.size();j++){
                if(al.get(j)==temp){
                    ll.set(j,1);
                    contador++;
                }
            }
            System.out.println(contador);
            int k = 0;
            int m = al.size()-1;
            while(contador>0){
               if(al.get(k).equals(1)){
                  ll.remove(k);
                  ll.remove(m);
                  k++;
                  m--;
                }else if(k.equals(m)){break;}
                else{k++;}
                contador--;
            }  
            break;   
        }
        System.out.println(ll);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int numCasos = Integer.parseInt(st.nextToken());
        for(int i=0;i<numCasos;i++){
        st = new StringTokenizer(in.readLine());
        int numll = Integer.parseInt(st.nextToken());
        List<Integer> al = new ArrayList<>();
        st = new StringTokenizer(in.readLine());
        for(int j=0; j<numll; j++) al.add(Integer.parseInt(st.nextToken()));
        miFuncionX(al);
        }
    }
}