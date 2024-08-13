public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;

    // Esta clase solo contiene datos y no tiene comportamiento

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Mal Olor: Middle Man
    // La clase Cliente no hace más que delegar la llamada a otra clase, lo que la convierte en un "Middle Man"
    public String obtenerCalle() {
        return direccion.getCalle();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
