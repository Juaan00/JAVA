import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class listasP {
    public static void miFuncionP(List<Integer> ll){
        ll.sort(null);
        int diferencia = Math.abs(ll.get(0)-ll.get(1));
        for(int i=2;i<ll.size();i++){
            int diferencia2 = Math.abs(ll.get(i)-ll.get(i-1));
            diferencia = Math.min(diferencia, diferencia2);
        }
        System.out.println(diferencia);
    }
    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream("/Users/juanfelipequiroga/Documents/JAVA/inlistasP.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int numCasos = Integer.parseInt(st.nextToken());
        for(int i=0;i<numCasos;i++){
            st = new StringTokenizer(in.readLine());
            int numll = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine());
            List<Integer> ll = new ArrayList<Integer>();
            for(int j=0;j<numll;j++){
                ll.add(Integer.parseInt(st.nextToken()));
            }
            miFuncionP(ll);
        }
        in.close();
    }
}
