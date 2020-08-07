package proyectohotelapp;

import java.io.*;

public class MenuGerente {

    ListaEmpleado listaEmpleado;

    public MenuGerente(ListaEmpleado le){
        listaEmpleado = le;
    }

    private String entrada(){
        String s="";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            s=br.readLine();
        }catch (Exception e){}
        return s;
    }

    public void menu(){
        int opcion;
        String nombre,cargo;
        int edad;
        double sueldo;
        do {
            System.out.println("MENU GERENTE");
            System.out.println("1. Listar empleados");
            System.out.println("2. Añadir empleado");
            System.out.println("0. Regresar");
            System.out.print("Ingrese: ");
            opcion = Integer.parseInt(entrada());
            switch (opcion) {
                case 1:
                    listaEmpleado.listarEmpleados();
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    nombre=entrada();
                    System.out.print("Edad: ");
                    edad=Integer.parseInt(entrada());
                    System.out.print("Cargo: ");
                    cargo=entrada();
                    System.out.print("Sueldo: ");
                    sueldo=Double.parseDouble(entrada());
                    listaEmpleado.anadirEmpleado(new Empleado(nombre,edad,cargo,sueldo));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion!=0);
    }
}
