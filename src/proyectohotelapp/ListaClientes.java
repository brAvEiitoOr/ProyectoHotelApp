package proyectohotelapp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private List<Cliente> listaClientes;

    public ListaClientes(){
        listaClientes = new ArrayList<>();
        try {
            String aux;
            FileReader file = new FileReader("ListaClientes");
            BufferedReader br = new BufferedReader(file);
            while ((aux = br.readLine()) != null){
                anadirCliente(aux);
            }
        }catch (Exception e){}
    }

    public void anadirCliente(Cliente c){
        listaClientes.add(c);
        try {
            FileWriter fw = new FileWriter("ListaClientes",true);
            fw.write("\n" + c.getNombres() + "," + c.getApellidos() + "," + c.getEdad() + "," + 
                    c.getCedula() + "," + c.getEmail());
            fw.close();
        }catch (Exception x){}
    }

    public void anadirCliente(String s){
        Cliente c =new Cliente();
        String[] str = s.split(",");
        c.setNombres(str[0]);
        c.setApellidos(str[1]);
        c.setEdad(Integer.parseInt(str[2]));
        c.setCedula(str[3]);
        c.setEmail(str[4]);
        listaClientes.add(c);
    }

    public Cliente obtenerCliente(String cedula){
        Cliente cl=null;
        for (Cliente c: listaClientes){
            if (c.getCedula().equals(cedula)){
                cl=c;
                break;
            }
        }
        return cl;
    }
    
    public Cliente obtenerCliente(int index){
        return listaClientes.get(index);
    }

    public int numeroClientes(){
        return listaClientes.size();
    }

    public void listarClientes(){
        for (Cliente c: listaClientes){
            System.out.println(c);
        }
    }
    
}
