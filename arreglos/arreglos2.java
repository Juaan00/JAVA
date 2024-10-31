public class arreglos2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int x = 1;
        A(arr,x);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        System.out.println(x);
    }

    static void A(int[] arr, int x) {

        //se está compartiendo la dirección de memoria. Por ende se afecta el arreglo de main

        //arr[0] = 10; arr[1] = 20; arr[2] = 30;
        
        arr = new int[3];
        arr[0]=4; arr[1]=5; arr[2]=6;

        //No afecta a arr en main, ya que se crea un nuevo arreglo con [4,5,6]

        x = 10;
    }
}