public class Evento {
    private Usuario usuario;
    private String nombreEvento;
    private String tipoEvento;
    private String fecha;
    private String hora;

    public Evento(Usuario usuario, String nombreEvento, String tipoEvento, String fecha, String hora) {
        this.usuario = usuario;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
}
