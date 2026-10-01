//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CentralMonitoreo central = new CentralMonitoreo();

    SensorPerimetral sensor1 = new SensorPerimetral(
            "Zona 1",
            "Barrera infrarroja",
            central
    );

    SensorPerimetral sensor2 = new SensorPerimetral(
            "Zona 2",
            "Camara de movimiento",
            central
    );

    sensor1.detectarMovimiento();
    sensor2.detectarMovimiento();

    central.mostrarReporte();
}
