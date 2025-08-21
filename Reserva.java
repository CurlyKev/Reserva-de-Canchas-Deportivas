public class Reserva {
    private Evento evento;
    private Cancha canchaAsignada;
    private String estado;

    public Reserva(Evento evento) {
        this.evento = evento;
        this.estado = "pendiente";
    }

    public void asignarCancha(Cancha cancha) {
        this.canchaAsignada = cancha;
        this.estado = "asignada";
    }

    public void cancelarReserva() {
        this.estado = "cancelada";
        this.canchaAsignada = null;
    }

    public Evento getEvento() {
        return evento;
    }

    public Cancha getCanchaAsignada() {
        return canchaAsignada;
    }

    public String getEstado() {
        return estado;
    }
}
