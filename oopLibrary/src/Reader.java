public class Reader { // Define la clase Reader y se escriben sus atributos
    public String carne;
    public String name;
    public String lastName;
    public String email;

    public Reader() { // Se deja vacia para asi poder llenarla con los datos
    }

    public Reader(String carne, String name, String lastName, String email) { // Constructor que recibe los datos del lector
        this.carne = carne;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String toString() { // Se define el metodo toString para que al imprimir un lector se muestre de una manera mas amigable
        return "LECTORES [CARNE=" + this.carne + ", NOMBRE=" + this.name + ", APELLIDO="+this.lastName+ ", CORREO ELECTRONICO=" + this.email + "]";
    }   
}
