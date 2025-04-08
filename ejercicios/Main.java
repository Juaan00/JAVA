import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static void miFuncionF(int numEntrada){
        if(numEntrada==1){
            System.out.println("YES	");
            System.out.println(0);
        }
        else if(numEntrada%2!=0){
            System.out.println("NO");
        }else{
        System.out.println("YES");
        ArrayList<ArrayList<Integer>> ll = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<numEntrada;i++){
            al.add(i);
        }
        ll.add(al);
        int condicion = 0;
        while(condicion<(numEntrada/2)-1){
            al = new ArrayList<Integer>();
            for(int i=1;i<numEntrada/2;i++){
                al.add(ll.get(condicion).get(i));
            }
            al.add(ll.get(condicion).get(numEntrada-1));
            al.add(ll.get(condicion).get(0));
            for(int i = numEntrada/2;i<numEntrada-1;i++){
                al.add(ll.get(condicion).get(i));
            }
            ll.add(al);
            condicion++;
        }
        while(condicion>=0){
            al = new ArrayList<Integer>();
            for(int i=numEntrada-1;i>=0;i--){
                al.add(ll.get(condicion).get(i));
            }
            ll.add(al);
            condicion--;
        }
        for(int k=0;k<ll.size();k++){
            for(int j=0;j<ll.size();j++){
                if(j==ll.size()-1){
                    System.out.println(ll.get(k).get(j));
                }else{
                    System.out.print(ll.get(k).get(j)+" ");
                }
            }
        }
    	}
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int numCasos = Integer.parseInt(st.nextToken());
        for(int i=0;i<numCasos;i++){
            st = new StringTokenizer(in.readLine());
            int numEntrada = Integer.parseInt(st.nextToken());
            miFuncionF(numEntrada);
        }
        in.close();
    }
}