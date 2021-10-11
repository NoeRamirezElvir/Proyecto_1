package hn.edu.ujcv.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    private String   codigo;
    private String   descripcion;
    private double   precio;
    private Empleado empleado;


    public Servicio() {
    }
    public Servicio(String pCodigo,String pDescripcion,double pPrecio,Empleado pEmpleado){
        this.codigo      = pCodigo;
        this.descripcion = pDescripcion;
        this.precio      = pPrecio;
        this.empleado    = pEmpleado;
    }

    public String   getCodigo() {
        return codigo;
    }
    public void     setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String   getDescripcion() {
        return descripcion;
    }
    public void     setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double   getPrecio() {
        return precio;
    }
    public void     setPrecio(double precio) {
        this.precio = precio;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void     setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void agregarServicio(ArrayList<Servicio> listaServicios){
        Empleado empleado  = new Empleado();
        Scanner teclado    = new Scanner(System.in).useDelimiter("\n");
        Servicio servicio1 = new Servicio();
        String   codigo;

        do{
            System.out.print("Ingrese el codigo del Servicio: ");
            codigo = teclado.next();

            if (validarCodigo(listaServicios, codigo)>0)
                System.out.println("Codigo ya existe! ");

        }while(validarCodigo(listaServicios, codigo) > 0);
        servicio1.setCodigo(codigo);
        System.out.print("Ingrese la descripcion del Servicio:");
        servicio1.setDescripcion(teclado.next());
        System.out.print("Ingrese el precio del Servicio: ");
        servicio1.setPrecio(teclado.nextDouble());
        System.out.print("Ingrese el codigo del Empleado: ");
        empleado.setCodigo( teclado.next());
        System.out.print("Ingrese el nombre del empleado: ");
        empleado.setNombre(teclado.next());
        System.out.print("Escriba la fecha de ingreso (dd/mm/yyyy): ");
        empleado.setFechaIngreso(teclado.next());
        System.out.print("Ingrese el puesto del empleado: ");
        empleado.setPuesto(teclado.next());
        servicio1.setEmpleado(empleado);
        listaServicios.add(servicio1);
    }

    public int validarCodigo(ArrayList<Servicio> listaServicios, String codigo){
        int contador = 0;
        for (Servicio item: listaServicios) {
            if(codigo.equals(item.getCodigo())){
                contador++;
            }
        }
        return contador;
    }
}