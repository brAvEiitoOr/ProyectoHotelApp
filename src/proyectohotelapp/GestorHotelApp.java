package proyectohotelapp;

import java.io.*;


public class GestorHotelApp {

    private static String entrada(){
        String s="";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            s=br.readLine();
        }catch (Exception e){}
        return s;
    }

    public static void main(String[] args) {

        //Esta seccion crea los objetos necesarios
        ListaEmpleado listaEmpleado = new ListaEmpleado();
        MenuCliente menuCliente = new MenuCliente();

        //Login primitivo que solo tiene el nombre
        String s;
        int op;
        MenuGerente mg = new MenuGerente(listaEmpleado);
        MenuEmpleado me = new MenuEmpleado();
        System.out.print("1: Empleado; 2: Cliente");
        op=Integer.parseInt(entrada());
        switch(op){
            case 1:
                System.out.print("Ingrese el nombre: ");
                s=entrada();
                for (int i=0; i<listaEmpleado.numeroEmpleados(); i++){
                    if(s.equals(listaEmpleado.obtenerEmpleado(i).getNombre())){
                        if(listaEmpleado.obtenerEmpleado(i).getCargo().equals("Gerente")){
                            mg.menu();
                            break;
                        }
                        else {
                            me.menu(listaEmpleado.obtenerEmpleado(i).getNombre());
                            break;
                        }

                    }
                    if (i==listaEmpleado.numeroEmpleados()-1){
                        System.out.println("No existe empleado");
                    }
                }
                break;
            case 2:
                break;
        }
    }
}
