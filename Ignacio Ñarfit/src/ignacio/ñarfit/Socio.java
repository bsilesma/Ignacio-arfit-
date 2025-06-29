/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ignacio.ñarfit;

/**
 *
 * @author brand
 */
public class Socio {

    //Definición de atributos
    private String nombre;
    private int cedula;
    private int id;
    private String correo;
    private String tipoMensualidad;
    private String fechaPago;
    private String fechaVencimiento;
    private String edad;

   
    //Definición de constructor
    public Socio(String nombre, int cedula, int id, String correo, String tipoMensualidad, String fechaPago, String fechaVencimiento, String edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.id = id;
        this.correo = correo;
        this.tipoMensualidad = tipoMensualidad;
        this.fechaPago = fechaPago;
        this.fechaVencimiento = fechaVencimiento;
        this.edad = edad;
    }
    
    //Definición de getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoMensualidad() {
        return tipoMensualidad;
    }

    public void setTipoMensualidad(String tipoMensualidad) {
        this.tipoMensualidad = tipoMensualidad;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    //Definición de toString
    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", cedula=" + cedula + ", id=" + id + ", correo=" + correo + ", tipoMensualidad=" + tipoMensualidad + ", fechaPago=" + fechaPago + ", fechaVencimiento=" + fechaVencimiento + ", edad=" + edad + '}';
    }

    
}
