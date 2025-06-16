package Ejercicios.Clase_;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    Scanner teclado = new Scanner(System.in);
    public void registrarConductores() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese nombre del conductor " + (i + 1));
            System.out.println("Nombre:");
            String nombre = teclado.next();
            System.out.println("Apellido:");
            String apellido = teclado.next();
            System.out.println("Celular:");
            String celular = teclado.next();
            Datosglo.listaConductores.add(new Conductor(nombre, apellido, celular));
        }
          System.out.println("Se Registraron los 10 Conductores.");
    }
public void registrarPacientes() {
    String[] nombres = {"Juan", "Ana", "Pedro", "Laura", "Luis", "Sofía", "Carlos", "María", "José", "Elena"};
    String[] apellidos = {"Gómez", "Pérez", "Rodríguez", "Martínez", "López", "Hernández", "Ramírez", "Torres", "Sánchez", "Díaz"};
    Random random = new Random();

    for (int i = 0; i < 100; i++) {
        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
        String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)];
        String celular = "3" + (100000000 + random.nextInt(900000000));

        Datosglo.listaPacientes.add(new Paciente(nombreAleatorio, apellidoAleatorio, celular));
    }
      System.out.println("Se generaron 100 pacientes aleatoriamente.");
}
    public void registrarMuertos() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese nombre del muerto " + (i + 1));
            System.out.println("Nombre:");
            String nombre = teclado.next();
            System.out.println("Apellido:");
            String apellido = teclado.next();
            System.out.println("Celular:");
            String celular = teclado.next();
            Datosglo.listaMuertos.add(new Muerto(nombre, apellido, celular));
        }
          System.out.println("Se Regiatraron los 15 Muertos.");
    }
    public void asignarVehiculos() {
       for (int i = 0; i < 10; i++) {
        Carro ambulancia = new Carro("Ambulancia", i + 1);  
        Conductor conductor = Datosglo.listaConductores.get(i);
        ambulancia.asignarConductor(conductor);                   
        Datosglo.listaVehiculos.add(ambulancia);             
    }

    Carro carroFunebre = new Carro("Carro Fúnebre", 1); 
    Conductor conductorFunebre = Datosglo.listaConductores.get(7); 
    carroFunebre.asignarConductor(conductorFunebre);              
    Datosglo.listaVehiculos.add(carroFunebre);              
    System.out.println("Vehículos asignados correctamente.");
    
    }
    public void asignarPacientesAConductores() {
    int totalConductores = 10; 
    int indexConductor = 0;

    for (Paciente paciente : Datosglo.listaPacientes) {
        Conductor conductor = Datosglo.listaConductores.get(indexConductor);
        conductor.asignarPaciente(paciente);
        
        indexConductor = (indexConductor + 1) % totalConductores;
    }
}
}
