import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class listasQ {
    public static void miFuncionQ(List<Integer> ll){
        //System.out.println(ll);
        ll.sort(null);
        int referencia = ll.get(0);
        int numDulces = 0;
        for(int i=1;i<ll.size();i++){
            int extraDulces = ll.get(i)-referencia;
            numDulces = numDulces+extraDulces;
        }
        System.out.println(numDulces);
    }
    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream("/Users/juanfelipequiroga/Documents/JAVA/inlistasQ.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int numCasos = Integer.parseInt(st.nextToken());
        for(int i=0;i<numCasos;i++){
            st = new StringTokenizer(in.readLine());
            int numll = Integer.parseInt(st.nextToken());
            List<Integer> ll = new ArrayList<Integer>();
            st = new StringTokenizer(in.readLine());
            for(int j=0;j<numll;j++){
                ll.add(Integer.parseInt(st.nextToken()));
            }
            miFuncionQ(ll);
        }
        in.close();
    }
}
