package hn.edu.ujcv.objetos;

public class Empleado {
    private String codigo;
    private String nombre;
    private String fechaIngreso;
    private String puesto;

    public Empleado(){
    }
    public Empleado(String pCodigo,String pNombre,String pFechaIngreso,String pPuesto){
        this.codigo       = pCodigo;
        this.nombre       = pNombre;
        this.fechaIngreso = pFechaIngreso;
        this.puesto       = pPuesto;
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
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
