/**
 *
 * @author tracy
 */
public class Notificador {
    private String tipoNotificacion;
    private GestorNotificaciones gestorNotificaciones;

    public Notificador(GestorNotificaciones gestorNotificaciones) {
        this.gestorNotificaciones = gestorNotificaciones;
    }
    public void notificarObserver(String tipoNotificacion, String data) {
        gestorNotificaciones.notificar(tipoNotificacion, data);
    }

    public void generarEvento(String tipoNotificacion, String data) {
        System.out.println("Generando evento de tipo: " + tipoNotificacion);
        notificarObserver(tipoNotificacion, data);
    }
}
