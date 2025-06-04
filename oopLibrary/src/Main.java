import java.time.LocalDate; // Importa LocalDate para manejar fechas
import java.util.ArrayList; // Importa ArrayList para manejar listas de objetos
import java.util.List; // Importa List para manejar listas de objetos
import java.util.Scanner; // Importa Scanner para leer la entrada del usuario

public class Main { //Se define la calse Main 
    static List<Book> books = new ArrayList(); //Crea una lista de libros
    static List<Reader> readers = new ArrayList(); //Crea una lista de lectores
    static List<Loan> loans = new ArrayList(); //Crea una lista de prestamos
    static Scanner scan;

    static { // Bloque estático para inicializar el escáner
        scan = new Scanner(System.in); // Inicializa el escáner para leer la entrada del usuario
    }

    public Main() { // Constructor de la clase Main vacio
    }

    public static void main(String[] args) throws Exception { // Método principal que inicia el programa
        int opcion; //Almacena la opcion del usuario

        do { //Ciclo que se repite hasta que el usuario decida salir
            System.out.println("Sistema de biblioteca seleccione una opción");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libro");
            System.out.println("3. Registrar lector");
            System.out.println("4. Listar lector");
            System.out.println("5. Registrar prestamo");
            System.out.println("6. Listar prestamos");
            System.out.println("7. salir");
            opcion = scan.nextInt();
            scan.nextLine(); // Limpia el buffer del escáner para evitar problemas al leer cadenas después de un número
            switch (opcion) { //Evalua la opcion que elige el usuario y reliza el proceso correspondiente
                case 1: registerBook(); break;
                case 2: getListBooks(); break;
                case 3: registerReader(); break;
                case 4: getListReaders(); break;
                case 5: registerLoan(); break;
                case 6: getListLoans(); break;
                default:
                    System.out.println("Opción no valida");
                break;
            }
        } while(opcion != 7);
    System.out.println("El programa ha finalizado");
    }

    public static void registerBook() { //Para registrar un libro
        Book book = new Book();
        System.out.println("Ingrese la información del libro");
        System.out.println("ISBN");
        book.isbn = scan.nextLine();        
        System.out.println("Titulo");
        book.title = scan.nextLine();
        System.out.println("Autor");
        book.author = scan.nextLine();
        System.out.println("Género");
        book.genere = scan.nextLine();
        System.out.println("Fecha de publicación (YYYY-MM-DD)");
        book.publicationDate = LocalDate.parse(scan.nextLine());
        books.add(book);
    }

    public static void getListBooks() { //Para listar los libros registrados
        for(int i = 0; i < books.size(); ++i) {
            System.out.println(((Book)books.get(i)).toString());
        }
        if (books.size() == 0) {
            System.out.println("No hay libros registrados");
        }
    }

    public static void registerReader() { //Para registrar un lector
        Reader reader = new Reader();
        System.out.println("Ingrese la información del lector");
        System.out.println("Carne");
        reader.carne = scan.nextLine();
        System.out.println("Nombre");
        reader.name = scan.nextLine();
        System.out.println("Apellido");
        reader.lastName = scan.nextLine();
        System.out.println("Email");
        reader.email = scan.nextLine();
        readers.add(reader);
    }

    public static void getListReaders() { //Para listar los lectores registrados
        for(int i = 0; i < readers.size(); ++i) {
            System.out.println(((Reader)readers.get(i)).toString());
        }
        if (readers.size() == 0) {
            System.out.println("No hay lectores registrados");
        }
    }

    public static void registerLoan() { //Para registrar un prestamo
        Loan loan = new Loan();
        System.out.println("Ingrese la información del prestamo");
        System.out.println("ID del prestamo");
        loan.id = scan.nextLine();
        System.out.println("ISBN del libro");
        loan.isbn = scan.nextLine();
        System.out.println("Carne del lector");
        loan.carne = scan.nextLine();
        System.out.println("Fecha de prestamo (YYYY-MM-DD)");
        loan.loanDate = LocalDate.parse(scan.nextLine());
        System.out.println("Fecha de devolucion (YYYY-MM-DD)");
        loan.returnDate = LocalDate.parse(scan.nextLine());
        loans.add(loan);
    }

    public static void getListLoans() { //Para listar los prestamos registrados
        for(int i = 0; i < loans.size(); ++i) {
            System.out.println(((Loan)loans.get(i)).toString());
        }
        if (loans.size() == 0) {
            System.out.println("No hay prestamos registrados");
        }
    }
}

