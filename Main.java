public class Main {
    public static void main(String[] args) {
        GestorReservas gestor = new GestorReservas();
        Vista vista = new Vista();

        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    gestor.asignarCanchas();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    continuar = false;
                    break;
            }
        }
    }
}
