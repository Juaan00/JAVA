
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static boolean verificadorCondicion(ArrayList<ArrayList<Integer>> ll, int i, int j,boolean condicion){
        int i1 = ll.size()-i-1;
        int j1 = ll.size()-j-1;
        int resultado1 = ll.get(i).get(j)+ll.get(i1).get(j);
        int resultado2 = ll.get(i).get(j)+ll.get(i).get(j1);
        if(resultado1!=ll.size()-1||resultado2!=ll.size()-1){condicion=false;}
        TreeSet<Integer> ar = new TreeSet<Integer>();
        for(int k=0;k<ll.size();k++){ar.add(k);}
        TreeSet<Integer> br = new TreeSet<Integer>();
        for(int k=0;k<ll.size();k++){
            br.add(ll.get(i).get(k));
        }
        if(ar.equals(br)==false){condicion=false;}
        br = new TreeSet<Integer>();
       	for(int k=0;k<ll.size();k++){
            br.add(ll.get(k).get(j));
        }
        if(ar.equals(br)==false){condicion=false;}
        
        return condicion;
    }
    static void verificadorMatriz(ArrayList<ArrayList<Integer>> ll){
        boolean condicion = true;
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<ll.size();i++){
            for(int j=0;j<ll.size();j++){
                condicion = verificadorCondicion(ll,i,j,condicion);
                if(condicion==false){
                    index1 = i;
                    index2 = j;
                    break;}
            }
            if(condicion==false){break;} 
        }
        if(condicion=true){System.out.println("Cumple condicion");}
        else{System.out.println("No cumple condición en la posición "+index1+" "+index2);}
    }
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
        verificadorMatriz(ll);
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