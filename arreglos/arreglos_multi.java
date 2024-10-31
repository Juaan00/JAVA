/*
 * Arreglos mutidimensionales (Matrices)
 * 
 * para seguir viendo más ir a la docu de Java de Arrays
 */
import java.util.Arrays;
public class arreglos_multi {
    public static void main(String[] args) {
        /*
            int[][] mat;
            //crear una matriz irregular
            mat = new int[5][];
            for(int i=0; i<5; i++){
                mat[i] = new int[i+1];
            }
            for (int i=0; i<mat.length; i++){
             //   for(int j=0; )
            } a mano
            */
        int[] arr = {6,7,1,2,3,10,9,8};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
