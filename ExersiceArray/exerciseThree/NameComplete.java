//Se realizan 4 arrays donde 1:primer nombre, 2:segundo nombre, 3: primer apellido y 4:segundo apellido luego de debe impimir una sola cadena con el nombre completo.
package exerciseThree;
import java.util.Scanner;
import java.util.Arrays;

public class NameComplete{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Se crea el arreglo para cadenas de texto y se instancia en una sola linea.
        String[] arrayOne = new String[1];
        String[] arrayTwo = new String[1]; 
        String[] arrayThree = new String[1]; 
        String[] arrayFour = new String[1];

        for(int x =0; x <1; x++){ //Solicita al usuario que ingrese los 10 números del arreglo.
            System.out.println("Digite el valor "+(x+1));
            arrayOne[x]= teclado.nextLine();
            arrayTwo[x]= teclado.nextLine();
            arrayThree[x]= teclado.nextLine();
            arrayFour[x]= teclado.nextLine();
        }
        //Con esta línea los datos se guardan de forma ascendente.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        Arrays.sort(arrayThree);
        Arrays.sort(arrayFour);

        System.out.println("\nNombre completo: " + arrayOne[0] + " " + arrayTwo[0] + " " + arrayThree[0] + " " + arrayFour[0]);

        teclado.close();
    }
}
