import java.util.ArrayList;
import java.util.Scanner;
public class ejercicios {
    static void miFuncion(int a, int b){
        if(a<1 || b < 1 || a>10000 || b>10000){
            System.out.println("");
        } 
        else{
            if((a*b)%2==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
    static void miFuncionDos(ArrayList <Integer> lista){
        int contador = 0;
        for(int i = 0; i<lista.size();i++){
            if(lista.get(i)==1){
                contador++;
            }
        }
        System.out.println(contador);


    }

    static void miFuncionTres(int a, ArrayList <Integer> lista){
        int contador = 0;
        boolean aja = true;
        while (aja==true) {
            if(a<1 || a>200){
                break;
            }
            for(int i = 0; i<lista.size();i++){
                if(lista.get(i)<1 || lista.get(i)>Math.pow(10, 9)){
                    aja=false;
                    break;
                }
                else if(lista.get(i)%2!=0){
                    aja=false;
                    break;
                }
                lista.set(i, lista.get(i)/2);
            }
            contador=contador+1;
        }
        System.out.println(contador-1);
        
    }

    static void miFuncionCuatro(ArrayList <Integer> lista, int x){
        int contador = 0;
        ArrayList <Integer> comb = new ArrayList<Integer>();
        ArrayList <Integer> comb2 = new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            comb.add(0);
        }
        int pond = 0;
        while(pond < x){
            if(x>=500+pond&&lista.get(0)>0){
                comb.set(0, comb.get(0)+1);
                lista.set(0,lista.get(0)-1);
                pond=pond+500;
            }
            else if(x>=100+pond&&lista.get(1)>0){
                comb.set(1, comb.get(1)+1);
                lista.set(1,lista.get(1)-1);
                pond=pond+100;
            }
            else if(x>=50+pond&&lista.get(2)>0){
                comb.set(2, comb.get(2)+1);
                lista.set(2,lista.get(2)-1);
                pond=pond+50;
            }
            else{
                break;}
            if(pond==x){contador++;}
            System.out.println(comb);
        }
        while(comb.get(0)>0){
            if(lista.get(1)>=comb.get(1)+5){
                comb.set(1, comb.get(1)+5);
                comb.set(0,comb.get(0)-1);
            }
            comb2 = (ArrayList)comb.clone();
            System.out.println(comb);
            contador++;
            while(comb.get(1)>0){
                comb.set(1, comb.get(1)-1);
                comb.set(2,comb.get(2)+2);
                System.out.println(comb);
                contador++;
            }
            comb = (ArrayList)comb2.clone();
        }
        System.out.println(contador);
    }

    public static void main(String[] args){
        Scanner inpt = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList<Integer>();
        lista.add(Integer.valueOf(inpt.nextLine()));
        lista.add(Integer.valueOf(inpt.nextLine()));
        lista.add(Integer.valueOf(inpt.nextLine()));
        int entrada = Integer.valueOf(inpt.nextLine());
        //String [] arr = entrada2.split(" ");
        //int a = Integer.valueOf(entrada);
        //for(int i =0;i<arr.length;i++){
        //    lista.add(Integer.valueOf(arr[i]));
        //}
        miFuncionCuatro(lista,entrada);
    }
}