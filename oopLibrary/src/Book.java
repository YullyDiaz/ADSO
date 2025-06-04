import java.time.LocalDate; //Importa localTime para las fechas

public class Book { //Se define la clase Book y se escriben sus atributos
    public String isbn;
    public String title;
    public String author;
    public String genere;
    public LocalDate publicationDate;

    public Book() { //Se deja vacia para asi poder llenarla con los datos
    }

    public Book(String isbn, String title, String author, String genere, LocalDate publicationDate) { //Constructor que recibe los datos del libro
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genere = genere;
        this.publicationDate = publicationDate;
    }

    public String toString() { //Se define el metodo toString para que al imprimir un libro se muestre de una manera mas amigable
        return "LIBROS [ISBN=" + this.isbn + ", TITULO=" + this.title + ", AUTOR=" + this.author + ", GENERO=" + this.genere + ", FECHA DE PUBLICACION=" + this.publicationDate + "]";
    }
}    
