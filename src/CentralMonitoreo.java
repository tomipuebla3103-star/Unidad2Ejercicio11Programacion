public class CentralMonitoreo {
    Alerta[] incidentesActivos = new Alerta[10];
    int cantidadAlertas = 0;

    public void procesarAlerta(Alerta alerta) {
        incidentesActivos[cantidadAlertas] = alerta;
        cantidadAlertas++;

        System.out.println("Alerta recibida por la central.");
    }

    public void mostrarReporte() {
        System.out.println("\n--- REPORTE DE ALERTAS ---");

        for (int i = 0; i < cantidadAlertas; i++) {
            incidentesActivos[i].mostrarAlerta();
            System.out.println("----------------------");
        }
    }
}
