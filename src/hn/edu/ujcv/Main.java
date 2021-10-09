package hn.edu.ujcv;

import hn.edu.ujcv.objetos.Producto;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String respuesta,respuesta2;
        int opcion;
        try{
            ArrayList<Producto> listaProductos = new ArrayList<>();
            System.out.println("                    - Menu - ");
            do {

                System.out.print("1 - Agregar productos. ");
                System.out.println(" 4 - Agregar servicio. ");
                System.out.print("2 - Agregar cliente. ");
                System.out.println("   5 - Agregar factura. ");
                System.out.print("3 - Agregar empleado. ");
                System.out.println("  6 - Visualizar factura. ");
                System.out.println("Seleccione una opcion.");
                System.out.println(" > ");
                opcion = teclado.nextInt();

                switch(opcion){
                    case 1:
                        //Agregar productos
                       do{
                           Producto producto = new Producto();
                           producto.agregarProducto(listaProductos);
                           System.out.println("----------------------------------");
                           producto.visualizarProducto(listaProductos);
                           System.out.println("----------------------------------");
                           System.out.println("Agregar otro producto S/N");
                           respuesta2 = teclado.next();
                       }while(respuesta2.equalsIgnoreCase("S"));
                        break;
                    case 2:
                        //Agregar cliente

                        break;
                    case 3:
                        //Agregar empleado
                        break;
                    case 4:
                        //Agregar servicio
                        break;
                    case 5:
                        //Agregar factura
                        break;
                    case 6:
                        //visualizar factura
                        break;
                    default:
                        break;
                }
                //-----------------------------------------------//
                System.out.print("Desea continuar S/N: ");
                respuesta = teclado.next();
            }while(respuesta.equalsIgnoreCase("s"));

        }catch(Exception e){
            System.err.println("Error " + e.getMessage());
        }
    }
    
}
