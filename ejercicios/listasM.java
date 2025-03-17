import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class listasM {
    public static void miFuncionM(List<Integer> l, int x){
        boolean resultado = true;
        int a = 0;
        l.sort(null);
        while(l.size()>1){
            for(int i = a+1;i<l.size();i++){
                if(Math.abs(l.get(a)-l.get(i))<=1){
                    if(Math.min(l.get(a),l.get(i))==l.get(a)){
                        l.remove(a);
                    } else {l.remove(i);}
                    break;
                } 
            }
            if(l.size()==x){a++;}
            x = l.size();
            if(a==l.size()){
                resultado = false;
                break;
            }
        }
        if(resultado==true){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int casos = Integer.parseInt(st.nextToken());
        for(int j=0;j<casos;j++){
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine());
            List<Integer> al = new ArrayList<>();
            for(int i=0; i<x; i++) al.add(Integer.parseInt(st.nextToken()));
            miFuncionM(al,x);
        }
    }
}
/*
2
3
1 2 2
4
5 5 5 5
3
1 2 4
4
1 3 4 4
1
100
3
10 10 10
4
1 2 3 4 


 */