package proyectohotelapp;

public class Habitacion {
    
    private String numeroHabitacion;
    private String Tipo;
    
    public Habitacion(){}

    public Habitacion(String numeroHabitacion, String Tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.Tipo = Tipo;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", Tipo=" + Tipo + '}';
    }
    
    
    
}
