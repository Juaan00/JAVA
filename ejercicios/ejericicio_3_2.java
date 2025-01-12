import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
public class ejericicio_3_2 {
        static boolean sonIguales(ArrayList<Integer> lista, int elem){
            int c = 0;
            boolean condicion = true;
            while(c<lista.size()){
                if(lista.get(c)<elem||lista.get(c)>elem){
                    condicion = false;
                    break;
                }
                c++;
            }
            return condicion;
        }
        static ArrayList<Integer> miFuncion(ArrayList<Integer> lista){
            Random opcion = new Random();
            while(lista.size()>1){
                // System.out.println(lista);
                lista.removeIf(n ->n==0);
                if(lista.isEmpty()){
                  break;
                }
                else if(lista.size()==1){
                  break;
                }
                else{
                int n = 1;
                // int k = opcion.nextInt(lista.size()-1);
                int k =0;
                System.out.println(k);
                int elem1 = lista.get(k);
                int elem2 = lista.get(k+n);
                if(elem1<=elem2){
                    lista.set(k,elem1-elem1);
                    lista.set(k+n,elem2-elem1);
                }
                else if(elem1>elem2){
                    lista.set(k, elem1-elem2);
                    lista.set(k+n,elem2-elem2);
                }
                else if(elem1==elem2){
                    if(sonIguales(lista, elem2) == true){
                        if(lista.size()%2==0){
                            lista.clear();
                        }else{
                            lista.clear();
                            lista.add(1);
                        }
                    }
                    else if(lista.size()==2){
                    lista.set(k,elem1-elem1);
                    lista.set(k+n,elem2-elem1);
                    }
                }
                // lista.set(k,elem1-1);
                // lista.set(k+n,elem2-1);
                }
                // System.out.println(lista);
            }
            return lista;
        }
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(in.readLine());
        // Scanner entrada = new Scanner(System.in);
        // String in_1 = entrada.nextLine();        // if(in_1==""){

        //     in_1=" ";
        // }
        //String[] elementos = in_1.split(" ");
        //for(int i=0;i<elementos.length;i++){lista.add(Integer.valueOf(elementos[i]));}
        // System.out.println(lista);
        if(lista.isEmpty()){
            System.out.println("NO");
        }
        else{
        miFuncion(lista);
        if(lista.isEmpty()|| lista.contains(0)){System.out.println("SI");}
        else{System.out.println("NO");}
        }
    }
}

