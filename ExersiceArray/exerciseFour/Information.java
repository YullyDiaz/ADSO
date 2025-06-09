package exerciseFour;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Se crean y se instancian los arreglos
        String[] name = new String[4];
        String[] typeId = new String[4];
        String[] id = new String[4];
        String[] rh = new String[4];
        String[] phone = new String[4];
        String[] email = new String[4];
        String[] address = new String[4];
        String[] charge = new String[4];

        for (int i = 0; i < 4; i++) {//Ciclo donde se pide al usuario que ingrese los datos
            System.out.println("Ingrese la información de la persona " + (i + 1) + ":");
            System.out.println("Nombre completo: ");
            name[i] = teclado.nextLine();
            System.out.println("Tipo de identificación: ");
            typeId[i] = teclado.nextLine();
            System.out.println("Número de identificación: ");
            id[i] = teclado.nextLine();
            System.out.println("RH: ");
            rh[i] = teclado.nextLine();
            System.out.println("Teléfono: ");
            phone[i] = teclado.nextLine();
            System.out.println("Correo electrónico: ");
            email[i] = teclado.nextLine();
            System.out.println("Dirección de residencia: ");
            address[i] = teclado.nextLine();
            System.out.println("Cargo: ");
            charge[i] = teclado.nextLine();
            System.out.println();
        }

        System.out.println("Número de la persona para ver su información:");
        int opcion = teclado.nextInt();

        switch (opcion) {//Elije que tarjeta o ficha desea ver el usuario
            case 1 : printInformation(0, name, typeId, id, rh, phone, email, address, charge);
            case 2 : printInformation(1, name, typeId, id, rh,phone, email, address, charge);
            case 3 : printInformation(2, name, typeId, id, rh, phone, email, address, charge);
            case 4 : printInformation(3, name, typeId, id, rh, phone, email, address, charge);
            default : System.out.println("Opción no válida.");
        }

        teclado.close();
    }

    public static void printInformation(int index, String[] name, String[] typeId, String[] id, String[] rh, String[] phone, String[] email, String[] address, String[] charge) {
        System.out.println("\nInformación de la persona seleccionada:");
        System.out.println("Nombre completo: " + name[index]);
        System.out.println("Tipo de identificación: " + typeId[index]);
        System.out.println("Número de identificación: " + id[index]);
        System.out.println("RH: " + rh[index]);
        System.out.println("Teléfono: " + phone[index]);
        System.out.println("Correo electrónico: " + email[index]);
        System.out.println("Dirección de residencia: " + address[index]);
        System.out.println("Cargo: " + charge[index]);
    }
}
