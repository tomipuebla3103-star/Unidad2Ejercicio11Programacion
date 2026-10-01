public class SensorPerimetral {
    String idZona;
    String tipoSensor;
    CentralMonitoreo central;

    public SensorPerimetral(String idZona, String tipoSensor, CentralMonitoreo central) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.central = central;
    }

    public void detectarMovimiento() {
        System.out.println("Movimiento detectado en " + idZona);

        Alerta alerta = new Alerta(
                idZona,
                tipoSensor,
                "01/10/2026 14:00"
        );

        central.procesarAlerta(alerta);
    }
}
