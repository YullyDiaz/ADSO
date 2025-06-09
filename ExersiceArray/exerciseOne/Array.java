//Se crean arreglos uno en donde se ingresan nueros y otro cadenas de texto luego se imprimen los resultaos que haya ingresado el usuario.
import java.util.Arrays; //Se importa la clase Array para manipular arreglos.
import java.util.Scanner; //Se importa para recibir la entrada en la consola.

public class Array{ //Se define la clase Arrays
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //int[] array = new int[10]; //Se crea el arreglo para números y se instancia en una sola línea.
        String[] array = new String[10]; //Se crea el arreglo para cadenas de texto y se instancia en una sola linea.

        for(int x =0; x <10; x++){ //Solicita al usuario que ingrese los 10 números del arreglo.
            System.out.println("Digite el valor "+(x+1));
            //array[x]=teclado.nextInt();
            array[x]= teclado.nextLine();
        }

        Arrays.sort(array); //Con esta línea los datos se guardan de forma ascendente.
        for(int i =0; i<10; i++){ //Muestra cada uno de los elementos igresados por el usuario.
            System.out.println(array[i]);
        }
        teclado.close();
    }
}