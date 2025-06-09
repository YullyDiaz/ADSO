//Se crea un arreglo donde se almacenan 10 números de los cuales se eligen 2 y se elige la operación que se desea realizar con ese números escogidos. 
package exerciseTwo;
import java.util.Scanner;

public class Calculator {
        public static double numberOne, numberTwo, result; //Se declaran las variables que se van a utilizar para las operaciones.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] array = new double[10]; //Se hace e instancia el arreglo.

        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < 10; i++) { //Se ingresan los 10 números al arreglo.
            System.out.println("Número " + (i + 1));
            array[i] = teclado.nextDouble();
        }
        boolean flag = true;

        do { //Ciclo que repite hasta que el usuario elige la opción de salir.
            System.out.println("Selecciona la operación que deseas realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingresa el número de la operación que quieres hacer: ");
            int opcion = teclado.nextInt();

            if (opcion == 5) { //Opción de salir
                flag = false;
                System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                break;
            }

            System.out.println("\nSelecciona dos números del arreglo para realizar la operación:");
            for (int i = 0; i < array.length; i++) { //Elige los números que dese aescoger para operar.
                System.out.println((i + 1) + array[i]);
            }

            System.out.print("Ingresa el número correspondiente al primer valor: ");
            int indexOne = teclado.nextInt() - 1;

            System.out.print("Ingresa el número correspondiente al segundo valor: ");
            int indexTwo = teclado.nextInt() - 1;

            if (indexOne < 0 || indexOne >= 10 || indexTwo < 0 || indexTwo >= array.length) {
                System.out.println("Índices no válidos. Intenta de nuevo.");
                continue;
            }

            numberOne = array[indexOne];
            numberTwo = array[indexTwo];

            switch (opcion) { //Que operación dese arealizar.
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                default:
                    System.out.println("Opción no válida.");
                break;
            }

            System.out.println();
        } while (flag);

        teclado.close();
    }
    //Inicio clases para las operaciones
    public static void addition() {
        result = numberOne + numberTwo;
        System.out.println("El resultado de la suma es: " + result);
    }

    public static void subtraction() {
        result = numberOne - numberTwo;
        System.out.println("El resultado de la resta es: " + result);
    }

    public static void multiplication() {
        result = numberOne * numberTwo;
        System.out.println("El resultado de la multiplicación es: " + result);
    }

    public static void division() {
        if (numberTwo != 0) {
            result = numberOne / numberTwo;
            System.out.println("El resultado de la división es: " + result);
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }
    }
    //Fin clase para las operaciones
}

