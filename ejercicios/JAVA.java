import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static void miFuncionF(int numEntrada){
        if(numEntrada%2!=0){
            System.out.println("NO");
        }else{
        System.out.println("YES");
        ArrayList<ArrayList<Integer>> ll = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numEntrada;i++){
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int j=0;j<numEntrada;j++){
                al.add(j, 0);
            }
            ll.add(al);
        }
        for(int j=0;j<numEntrada;j++){
            int index2 = numEntrada - 1 - j;
            ll.get(0).set(j,j);
            ll.get(j).set(0,j);
            ll.get(numEntrada-1).set(j,index2);
            ll.get(j).set(numEntrada-1,index2);
        }
        int index1 = (ll.size()/2)-1;
        int index2 = ll.size()/2;
        while(numEntrada>0){
            int elemento1 = ll.get(0).get(index1);
            int elemento2 = ll.get(0).get(index2);
            System.out.println(elemento1);
            System.out.println(elemento2);
            int temp = 0;
            int p1 = 1;
            int p2 = ll.size()-2;
            int p3 = 1;
            int op = (numEntrada/2)-1;
            while(op>0){
                boolean cond = true;
                for(int j=0;j<numEntrada/2;j++){
                    if(ll.get(j).get(p1)==elemento1||ll.get(j).get(p1)==elemento2){
                        System.out.println("aja");
                        cond=false;
                        op--;
                    }
                }
                if(cond==true&&ll.get(p3).contains(elemento1)==false&&ll.get(p3).get(p1)==0){
                    ll.get(p3).set(p1,elemento2);
                    ll.get(p3).set(p2,elemento1);
                    ll.get(ll.size()-1-p3).set(p1,elemento1);
                    ll.get(ll.size()-1-p3).set(p2,elemento2);
                    op--;
                    temp = elemento2;
                    elemento2=elemento1;
                    elemento1=temp;
                }else{
                    p1++;
                    p2--;
                    p3++;
                }
            }
            for(int i=0;i<numEntrada;i++){
                System.out.println(ll.get(i));
            }
            index1--;
            index2++;
            numEntrada=numEntrada-2;
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

    }
}