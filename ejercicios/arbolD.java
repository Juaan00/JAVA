import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class arbolD {
    public static void miFuncionD(TreeMap<Integer,Integer> sg, TreeMap<Integer,Integer> sb, int numCampos){
        boolean seguir = true;
        while(seguir==true){
        TreeMap<Integer,Integer> sobrevivientesSG = new TreeMap<Integer,Integer>();
        TreeMap<Integer,Integer> sobrevivientesSB = new TreeMap<Integer,Integer>();
        for(int i =0;i<numCampos;i++){
            if(sg.isEmpty()||sb.isEmpty()){break;}
            int peleadorG = sg.lastKey();
            sg.put(peleadorG, sg.get(peleadorG)-1);
            if(sg.get(peleadorG)<=0){sg.remove(peleadorG);}
            int peleadorB = sb.lastKey();
            sb.put(peleadorB, sb.get(peleadorB)-1);
            if(sb.get(peleadorB)<=0){sb.remove(peleadorB);}
            int vencedor = peleadorG - peleadorB;
            if(vencedor>0){ //ganó G
                if(sobrevivientesSG.containsKey(vencedor)){sobrevivientesSG.put(vencedor, sobrevivientesSG.get(vencedor)+1); }
                else{sobrevivientesSG.put(vencedor, 1);}
            }else if(vencedor<0){ //ganó B
                int vencedorABS = Math.abs(vencedor);
                if(sobrevivientesSB.containsKey(vencedorABS)){
                    int nuevoTotalABS = sobrevivientesSB.get(vencedorABS)+1;
                    sobrevivientesSB.put(vencedorABS, nuevoTotalABS); 
                }
                else{sobrevivientesSB.put(vencedorABS,1);}
            }
        }
        for (int e : sobrevivientesSG.keySet()){
            int cantidad = sobrevivientesSG.get(e);
            for(int k=0;k<cantidad;k++){
                if(sg.containsKey(e)){sg.put(e, sg.get(e)+1); }
                else{sg.put(e, 1);}
            }
        }
        for (int e : sobrevivientesSB.keySet()){
            int cantidad = sobrevivientesSB.get(e);
            for(int k = 0;k<cantidad;k++){
                if(sb.containsKey(e)){sb.put(e, sb.get(e)+1); }
                else{sb.put(e, 1);}
            }
        }
        if(sg.isEmpty()||sb.isEmpty()){seguir = false;}   
        }
        if(sg.isEmpty()&&sb.isEmpty()){System.out.println("green and blue died");}
        else{
            if(sb.isEmpty()){
                System.out.println("green wins");
                int minionG = sg.size();
                for(int i=0;i<minionG;i++){
                    int llave = sg.lastKey();
                    for(int j=0;j<sg.get(llave);j++){System.out.println(llave);}
                    sg.remove(llave);
                }
            }else{
                System.out.println("blue wins");
                int minionB = sb.size();
                for(int i=0;i<minionB;i++){
                    int llave = sb.lastKey();
                    for(int j=0;j<sb.get(llave);j++){System.out.println(llave);}
                    sb.remove(llave);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); si el input es de consola
        FileInputStream file = new FileInputStream("/workspaces/JAVA/ejercicios/inarbolD.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(file));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int casos = Integer.parseInt(st.nextToken());
        int contador = 1;
        for(int i = 0;i<casos;i++){
            st = new StringTokenizer(in.readLine());
            int numCampos = Integer.parseInt(st.nextToken());
            int numsg = Integer.parseInt(st.nextToken());
            int numsb = Integer.parseInt(st.nextToken());
            TreeMap<Integer,Integer> sg = new TreeMap<Integer,Integer>();
            TreeMap<Integer,Integer> sb = new TreeMap<Integer,Integer>();
            for(int j=0;j<numsg;j++){
                st = new StringTokenizer(in.readLine());
                int valor = Integer.valueOf(st.nextToken());
                if(sg.containsKey(valor)){
                    sg.put(valor, sg.get(valor)+1);
                }else{
                    sg.put(valor,1);
                }
            }
            for(int j=0;j<numsb;j++){
                st = new StringTokenizer(in.readLine());
                int valor = Integer.valueOf(st.nextToken());
                if(sb.containsKey(valor)){
                    sb.put(valor, sb.get(valor)+1);
                }else{
                    sb.put(valor,1);
                }
            }
            miFuncionD(sg, sb, numCampos);
            if(contador<casos){System.out.println();}
            contador++;
        }
        in.close();
    }
}
