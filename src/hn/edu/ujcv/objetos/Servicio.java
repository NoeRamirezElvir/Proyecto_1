package hn.edu.ujcv.objetos;

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

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}