package beans;

public class Cliente {
    
    private int idCliente;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String costo;
    private String descuento;

    public Cliente(int idCliente, String contrasena, String nombre, String apellido, String telefono, String email, String costo, String descuento) {
        this.idCliente = idCliente;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.costo = costo;
        this.descuento = descuento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + ", costo=" + costo + ", descuento=" + descuento + '}';
    }

    
    
}
