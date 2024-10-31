//Estructura de datos __arreglos__

public class arreglo{
    public static void main(String[]args){
        int[] arr3 = {1,2,3,4,5};
        // crear arreglos especificando los elementos que tendrá.    
        int[] arr = new int[10];
        //for es lo más elemental para trabajar sobre los arreglos
        for (int i=0; i<arr.length;i++){
            arr[i] = 20;
        }

        //este for tiene la dirección de cada arreglo. Se puede cambiar el arreglo directamente

        for (int i=0; i<arr.length;i++)
            System.out.print(arr[i] + " ");

        // existe también el forish

        for (int elem:arr)
            System.out.print(elem);

        //forish da acceso a los datos de forma indirecta. No se puede cambiar el arreglo directamente
        int[] arr2 = new int[20];
        //System.out.println(arr);
        int[] arr_viejo = arr;
        /*Asignar una nueva variable al viejo arreglo para asignar la dirección del arreglo */
        arr = new int[50]; 
        /*  al mover de la dirección se pierde el arreglo original, el garbage colector automáticamente libera la memoría. */
        arr[0] = 100;
        /* variables que contienen direcciones en memoria */
    }
}