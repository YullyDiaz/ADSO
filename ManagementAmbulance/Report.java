package Ejercicios.Clase_;

public class Reporte {
    public void generarReporte() {
        System.out.println(" REPORTE GENERAL ");

        for (Carro vehiculo : Datosglo.listaVehiculos) {
            Conductor conductor = vehiculo.conductor;
            System.out.println("\nVehículo: " + vehiculo.tipo + " #" + vehiculo.idVehiculo);
            System.out.println("Conductor: " + (conductor != null ? conductor : "No asignado"));

            if (vehiculo.tipo.equals("Ambulancia")) {
                if (conductor != null && !conductor.pacientesAsignados.isEmpty()) {
                    System.out.println("Pacientes recogidos:");
                    for (Paciente p : conductor.pacientesAsignados) {
                        System.out.println("   - " + p);
                    }
                } else {
                    System.out.println("   No se recogieron pacientes.");
                }
            } else if (vehiculo.tipo.equals("Carro Fúnebre")) {
                if (!Datosglo.listaMuertos.isEmpty()) {
                    System.out.println("Muertos recogidos:");
                    for (Muerto m : Datosglo.listaMuertos) {
                        System.out.println("   - " + m);
                    }
                } else {
                    System.out.println("No se recogieron muertos.");
                }
            }
        }

        System.out.println("FIN DEL REPORTE");
    }
}
