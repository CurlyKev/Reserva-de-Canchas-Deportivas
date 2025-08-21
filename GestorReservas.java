import java.util.ArrayList;

public class GestorReservas {
    private ArrayList<Cancha> canchasDisponibles = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private ArrayList<Reserva> listaEspera = new ArrayList<>();

    public void registrarCancha(Cancha cancha) {
        canchasDisponibles.add(cancha);
    }

    public void recibirReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void asignarCanchas() {
        for (Reserva reserva : reservas) {
            if (reserva.getEstado().equals("pendiente")) {
                for (Cancha cancha : canchasDisponibles) {
                    reserva.asignarCancha(cancha);
                    break;
                }
                if (reserva.getEstado().equals("pendiente")) {
                    listaEspera.add(reserva);
                }
            }
        }
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
        listaEspera.remove(reserva);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Reserva> getListaEspera() {
        return listaEspera;
    }

    public ArrayList<Cancha> getCanchasDisponibles() {
        return canchasDisponibles;
    }
}
