package proyectohotelapp;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ListaEmpleado {

    private List<Empleado> listaEmpleado;

    public ListaEmpleado(){
        listaEmpleado = new ArrayList<>();
    }

    public void anadirEmpleado(Empleado e){
        listaEmpleado.add(e);
        try {
            FileWriter fw = new FileWriter("ListaEmpleados",true);
            fw.write("\n" + e.getNombre() + "," + e.getEdad() + "," + e.getCargo() + "," + e.getSueldo());
            fw.close();
        }catch (Exception x){}
    }

    public void anadirEmpleado(String s){
        Empleado e =new Empleado();
        String[] str = s.split(",");
        e.setNombre(str[0]);
        e.setEdad(Integer.parseInt(str[1]));
        e.setCargo(str[2]);
        e.setSueldo(Double.parseDouble(str[3]));
        listaEmpleado.add(e);
    }

    public Empleado obtenerEmpleado(int index){
        return listaEmpleado.get(index);
    }

    public int numeroEmpleados(){
        return listaEmpleado.size();
    }

    public void listarEmpleados(){
        for (Empleado e: listaEmpleado){
            System.out.println(e);
        }
    }
}
