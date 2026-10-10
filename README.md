<img width="493" height="301" alt="WhatsApp Image 2026-10-01 at 14 11 32" src="https://github.com/user-attachments/assets/07554921-3715-4fa7-bfa7-247743967f3c" />

Sistema de Alarmas y Monitoreo de Seguridad

 Descripción
Este proyecto consiste en un sistema en Java que permite registrar alertas de seguridad generadas por sensores perimetrales. Cuando un sensor detecta movimiento, envía un mensaje a una central de monitoreo que registra el incidente.

 Clases
- **Alerta:** contiene el identificador de la zona, el tipo de sensor y la marca temporal del incidente.
- **CentralMonitoreo:** recibe las alertas mediante el método `procesarAlerta(Alerta alerta)` y las guarda en una lista de incidentes activos.
- **SensorPerimetral:** tiene una referencia a la central de monitoreo y utiliza el método `detectarMovimiento()` para generar y enviar una alerta.

Funcionamiento
En el `main` se crea una central de monitoreo y se instancian al menos dos sensores asociados a ella. Luego, se simulan detecciones de movimiento y se muestra por consola el reporte de las alertas registradas.

Recorrido del mensaje
1. El programa crea la central de monitoreo.
2. Se crean dos sensores perimetrales y se los asocia con la central.
3. Se llama al método `detectarMovimiento()` de un sensor.
4. El sensor genera un objeto `Alerta` con la zona, el tipo de sensor y la fecha y hora del incidente.
5. El sensor envía la alerta a la central mediante el método `procesarAlerta()`.
6. La central recibe el mensaje y registra la alerta en su lista de incidentes activos.
7. El proceso se repite con el segundo sensor.
8. Finalmente, la central muestra por consola el reporte de todas las alertas recibidas.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de referencias entre clases, el envío de objetos como parámetros y el registro de eventos mediante listas.
