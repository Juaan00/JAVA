/*Link -> https://codeforces.com/problemset/problem/2081/F */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FHotMatrix {
    public static void miFuncionF(int numEntrada){
        System.out.println(numEntrada);
        ArrayList<ArrayList<Integer>> ll = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numEntrada;i++){
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int j=0;j<numEntrada;j++){
                al.add(j, null);
            }
            ll.add(al);
        }
        for(int i=0;i<numEntrada;i++){
            System.out.println(ll.get(i));
        }
    }
    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream("inFHotMatrix.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int numCasos = Integer.parseInt(st.nextToken());
        for(int i=0;i<numCasos;i++){
            st = new StringTokenizer(in.readLine());
            int numEntrada = Integer.parseInt(st.nextToken());
            miFuncionF(numEntrada);
        }

    }
}
