package proyectohotelapp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListaHabitacion {
    
    private List<Habitacion> listaHabitacion;

    public ListaHabitacion(){
        listaHabitacion = new ArrayList<>();
        try {
            String aux;
            FileReader file = new FileReader("ListaEmpleados");
            BufferedReader br = new BufferedReader(file);
            while ((aux = br.readLine()) != null){
                anadirHabitacion(aux);
            }
        }catch (Exception e){}
    }

    public void anadirHabitacion(Habitacion h){
        listaHabitacion.add(h);
        try {
            FileWriter fw = new FileWriter("ListaHabitaciones",true);
            fw.write("\n" + h.getNumeroHabitacion() + "," + h.getTipo());
            fw.close();
        }catch (Exception x){}
    }

    public void anadirHabitacion(String s){
        Habitacion h =new Habitacion();
        String[] str = s.split(",");
        h.setNumeroHabitacion(str[0]);
        h.setTipo(str[1]);
        listaHabitacion.add(h);
    }

    public Habitacion obtenerHabitacion(String num){
        Habitacion ha=null;
        for (Habitacion h: listaHabitacion){
            if (h.getNumeroHabitacion().equals(num)){
                ha=h;
                break;
            }
        }
        return ha;
    }

    public int numeroHabitaciones(){
        return listaHabitacion.size();
    }

    public void listarHabitaciones(){
        for (Habitacion h: listaHabitacion){
            System.out.println(h);
        }
    }
    
}
