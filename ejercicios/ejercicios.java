public class ejercicios {
    public void miFuncion(int a, int b){
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
    public static void main(String[] args){

    }
}