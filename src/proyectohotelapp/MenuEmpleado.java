package proyectohotelapp;

import java.io.*;

public class MenuEmpleado {

    private String entrada(){
        String s="";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            s=br.readLine();
        }catch (Exception e){}
        return s;
    }

    public void menu(String enNombre) {
        int opcion;
        String nombre, cargo;
        int edad;
        double sueldo;
        do {
            System.out.println("MENU EMPLEADO: "+ enNombre);
            System.out.println("1. Listar empleados");
            System.out.println("2. Añadir empleado");
            System.out.println("0. Regresar");
            System.out.print("Ingrese: ");
            opcion = Integer.parseInt(entrada());
        }while (opcion!=0);
    }
}
