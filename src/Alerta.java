public class Alerta {
    String idZona;
    String tipoSensor;
    String MarcaTemporal;

    public Alerta(String idZona,String tipoSensor,String MarcaTemporal){
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.MarcaTemporal = MarcaTemporal;
    }
    public void mostrarAlerta() {
        System.out.println("Zona: " + idZona);
        System.out.println("Sensor: " + tipoSensor);
        System.out.println("Fecha y hora: " + MarcaTemporal);
    }
}
