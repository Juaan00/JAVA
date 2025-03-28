import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class listasO{
    public static void miFuncionO(List<Integer> ll, List<Integer> al,int numMov, int numll){
        ll.sort(null);
        al.sort(null);
        //System.out.println(ll);
        //System.out.println(al);
        int contador = 0;
        for(int i=al.size()-1;i>=0;i--){
            if(numMov==0){break;}
            else if(al.get(i)>ll.get(contador)){
                ll.remove(contador);
                ll.add(al.get(i));
                numMov--;
            }else{contador++;}
        }
        int resultado = 0;
        for(int elemento: ll){
            resultado +=elemento;
        }
        System.out.println(resultado);
        //System.out.println(ll);
        //System.out.println(al);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //FileInputStream file = new FileInputStream("/Users/juanfelipequiroga/Documents/JAVA/inlistasO.txt");
        //BufferedReader in = new BufferedReader(new InputStreamReader(file));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int numCasos = Integer.parseInt(st.nextToken());
        for(int i=0;i<numCasos;i++){
            List<Integer> ll = new ArrayList<Integer>();
            List<Integer> al = new LinkedList<Integer>();
            st = new StringTokenizer(in.readLine());
            int numll = Integer.parseInt(st.nextToken());
            int numMov = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine());
            for(int j=0;j<numll;j++){
                ll.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(in.readLine());
            for(int j=0;j<numll;j++){
                al.add(Integer.parseInt(st.nextToken()));
            }
            miFuncionO(ll, al, numMov,numll);
        }
        in.close();
    }
}