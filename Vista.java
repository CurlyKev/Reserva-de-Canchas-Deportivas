import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("1. Registrar cancha disponible");
        System.out.println("2. Ingresar solicitud de reserva");
        System.out.println("3. Asignar canchas a reservas");
        System.out.println("4. Mostrar reservas por cancha");
        System.out.println("5. Cancelar reserva");
        System.out.println("6. Eliminar reserva");
        System.out.println("7. Salir");
    }

    public int leerOpcion() {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }
}

