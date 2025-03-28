import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class listasR {
    public static void miFuncionR(ArrayList<Integer> ll){
        ll.sort(null);
        boolean condicion = true;
        for(int i=1;i<ll.size();i++){
            if(ll.get(i)<=ll.get(i-1)){
                condicion=false;
                break;
            }
        }
        if(condicion==true){System.out.println("YES");}
        else{System.out.println("NO");}
    }
    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream("/Users/juanfelipequiroga/Documents/JAVA/inlistasR.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int numCasos = Integer.parseInt(st.nextToken());
        for(int i=0;i<numCasos;i++){
            st = new StringTokenizer(in.readLine());
            int numll = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine());
            ArrayList<Integer> ll = new ArrayList<Integer>();
            for(int j=0;j<numll;j++){
                ll.add(Integer.parseInt(st.nextToken()));
            }
            miFuncionR(ll);
        }
        in.close();
    }
}
