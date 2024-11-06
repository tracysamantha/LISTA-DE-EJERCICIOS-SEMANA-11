/**
 *
 * @author tracy
 */
class Suscripcion {
    private String tipoNotificacion;
    private Observer observador;
    private String estado;

    public Suscripcion(String tipoNotificacion, Observer observador) {
        this.tipoNotificacion = tipoNotificacion;
        this.observador = observador;
        this.estado = "activo";
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public Observer getObservador() {
        return observador;
    }

    public void setObservador(Observer observador) {
        this.observador = observador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
