package hn.edu.ujcv.objetos;

public class Cliente {
    private long   identidad;
    private String nombre;
    private String fechaIngreso;
    private String categoria;

    public Cliente(){
    }
    public Cliente(long pIdentidad,String pNombre,String pFechaIngreso,String pCategoria){
        this.identidad    = pIdentidad;
        this.nombre       = pNombre;
        this.fechaIngreso = pFechaIngreso;
        this.categoria    = pCategoria;
    }

    public long getIdentidad() {
        return identidad;
    }
    public void setIdentidad(long identidad) {
        this.identidad = identidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }




}
