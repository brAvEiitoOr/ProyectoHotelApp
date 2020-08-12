package proyectohotelapp;

public class Cliente {
    private String nombres;
    private String apellidos;
    private int edad;
    private String cedula;
    private String email;
    
    public Cliente(){}

    public Cliente(String nombres, String apellidos, int edad, String cedula, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cedula = cedula;
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", cedula=" + cedula + ", email=" + email + '}';
    }
    
    
}
