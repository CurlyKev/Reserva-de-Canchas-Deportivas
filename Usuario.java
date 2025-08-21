public class Usuario {
    private String nombre;
    private int edad;
    private String contacto;

    public Usuario(String nombre, int edad, String contacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getContacto() {
        return contacto;
    }
}
