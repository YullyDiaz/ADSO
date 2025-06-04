import java.time.LocalDate; // Importa localTime para las fechas

public class Loan { //Sdefine la calse Loan y se escriben sus atributos
    public String id;
    public String isbn;
    public String carne;
    public LocalDate loanDate;
    public LocalDate returnDate;

    public Loan() { //Se deja vacia para asi poder llenarla con los datos
    }

    public Loan(String id, String isbn, String carne, LocalDate loanDate, LocalDate returnDate) { //Constructor que recibe los datos del prestamo
        this.id = id;
        this.isbn = isbn;
        this.carne = carne;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public String toString() { //Se define el metodo toString para que al imprimir un prestamo se muestre de una manera mas amigable
        return "PRESTAMO [ID=" + this.id + ", ISBN=" + this.isbn + ", CARNE=" + this.carne + ", FECHA DE PRESTAMO=" + this.loanDate + ", FECHA DE DEVOLUCION=" + this.returnDate + "]";
    }
    
}
