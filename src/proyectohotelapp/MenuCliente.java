package proyectohotelapp;

import java.io.*;

public class MenuCliente {
    
    private ListaClientes listaClientes;
    
    public MenuCliente(){
        listaClientes = new ListaClientes();
    }
    
    public void registrarUsuario(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String nombre="";
        String apellido="";
        int edad=0;
        String cedula="";
        String email="";
        System.out.print("Ingrese nombre: ");
        try{
            nombre=br.readLine();
        }catch(Exception e){}
        System.out.print("Ingrese apellido: ");
        try{
            apellido=br.readLine();
        }catch(Exception e){}
        System.out.print("Ingrese edad: ");
        try{
            edad=Integer.parseInt(br.readLine());
        }catch(Exception e){}
        System.out.print("Ingrese cedula: ");
        try{
            cedula=br.readLine();
        }catch(Exception e){}
        System.out.print("Ingrese email: ");
        try{
            email=br.readLine();
        }catch(Exception e){}
        
        listaClientes.anadirCliente(new Cliente(nombre,apellido,edad,cedula,email));
        
    }
    
    public void menu(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String cedula="";
        int op=0;
        boolean nCliente=false;
        System.out.print("Ingrese cedula: ");
        try{
            cedula = br.readLine();
        }catch(Exception e){}
        for (int i=0; i<listaClientes.numeroClientes();i++){
            if (listaClientes.obtenerCliente(i).getCedula().equals(cedula)){
                nCliente=true;
                break;
            }
        }
        
    }
    
}
