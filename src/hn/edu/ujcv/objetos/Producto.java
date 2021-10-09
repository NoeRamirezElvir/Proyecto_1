package hn.edu.ujcv.objetos;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int    stock;

    public Producto(){
    }
    public Producto(String pCodigo,String pNombre,double pPrecio,int pStock){
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.precio = pPrecio;
        this.stock  = pStock;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void agregarProducto(ArrayList<Producto> listaProductos){
        Producto productos = new Producto();
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String  codigo,nombre;
        double  precio;
        int     stock;
        System.out.print("Ingrese codigo del producto: ");
        codigo = teclado.next();
        productos.setCodigo(codigo);
        System.out.print("Ingrese el nombre del producto: ");
        nombre = teclado.next();
        productos.setNombre(nombre);
        System.out.print("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();
        productos.setPrecio(precio);
        System.out.print("Ingrese el stock del producto: ");
        stock = teclado.nextInt();
        productos.setStock(stock);
        listaProductos.add(productos);
    }
    public void visualizarProducto(ArrayList<Producto> listaProductos){
        for (Producto item: listaProductos){
            System.out.println("Codigo del producto: " + item.getCodigo() +
                    " Nombre: " + item.getNombre() +
                    " Precio: " + item.getPrecio() +
                    " Stock: " + item.getStock());
        }
    }
    public void buscarProducto(ArrayList<Producto> listaProductos){
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String codigo,codigoLista,pruebaCodigo,nombre;
        System.out.print("Ingrese el codigo del producto a buscar: ");
        codigo = teclado.next();
        for (int i= 0;  i< listaProductos.size() ; ++i) {
            Producto productos = new Producto();
            productos = listaProductos.get(i);
            pruebaCodigo = productos.getCodigo();
            nombre = productos.getNombre();
            System.out.println(nombre +" "+ pruebaCodigo);
        }


    }


}
