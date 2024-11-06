import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tracy
 */
public class GestorNotificaciones {
    private List<Suscripcion> suscripciones;

    public GestorNotificaciones() {
        suscripciones = new ArrayList<>();
    }

    public void suscribirObserver(String tipoNotificacion, Observer observador) {
        Suscripcion nuevaSuscripcion = new Suscripcion(tipoNotificacion, observador);
        suscripciones.add(nuevaSuscripcion);
        System.out.println(observador + " se ha suscrito a las notificaciones de tipo: " + tipoNotificacion);
    }

    public void eliminarSuscripcion(String tipoNotificacion, Observer observador) {
        suscripciones.removeIf(s -> s.getObservador() == observador && s.getTipoNotificacion().equals(tipoNotificacion));
        System.out.println("Se elimino la suscripcion de " + observador + " para el tipo: " + tipoNotificacion);
    }

    public void notificar(String tipoNotificacion, String data) {
        for (Suscripcion suscripcion : suscripciones) {
            if (suscripcion.getTipoNotificacion().equals(tipoNotificacion)) {
                suscripcion.getObservador().update(tipoNotificacion, data);
            }
        }
    }
}
