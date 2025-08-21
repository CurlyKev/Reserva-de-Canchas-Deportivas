public class Cancha {
    private int numero;
    private String tipo;
    private int capacidad;
    private double costoPorHora;

    public Cancha(int numero, String tipo, int capacidad, double costoPorHora) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.costoPorHora = costoPorHora;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }
}

