package modelo;

import java.sql.Blob;

public class HojaVida {
    private int hoj_id;
    private int cedula;
    private String nombre;
    private String genero;
    private String estadoCivil;
    private String canton;
    private String ciudad;
    private String direccion;
    private int telefonoPersonal;
    private String correo;
    private String descripcion;
    private String formacion;
    private int telreferencia1;
    private int telreferencia2;
    private String nombreReferencia1;
    private String nombreReferencia2;
    private String habilidades;
    private String adiccional;
    private Blob imagen;

    public HojaVida() {
    }

    public HojaVida(int hoj_id,int cedula, String nombre, String genero, String estadoCivil, String canton, String ciudad, String direccion, int telefonoPersonal, String correo, String descripcion, String formacion, int telreferencia1, int telreferencia2, String nombreReferencia1, String nombreReferencia2, String habilidades, String adiccional, Blob imagen) {
        this.hoj_id = hoj_id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.canton = canton;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefonoPersonal = telefonoPersonal;
        this.correo = correo;
        this.descripcion = descripcion;
        this.formacion = formacion;
        this.telreferencia1 = telreferencia1;
        this.telreferencia2 = telreferencia2;
        this.nombreReferencia1 = nombreReferencia1;
        this.nombreReferencia2 = nombreReferencia2;
        this.habilidades = habilidades;
        this.adiccional = adiccional;
        this.imagen=imagen;
    }

    public int getHoj_id() {
        return hoj_id;
    }

    public void setHoj_id(int hoj_id) {
        this.hoj_id = hoj_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefonoPersonal() {
        return telefonoPersonal;
    }

    public void setTelefonoPersonal(int telefonoPersonal) {
        this.telefonoPersonal = telefonoPersonal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public int getTelreferencia1() {
        return telreferencia1;
    }

    public void setTelreferencia1(int telreferencia1) {
        this.telreferencia1 = telreferencia1;
    }

    public int getTelreferencia2() {
        return telreferencia2;
    }

    public void setTelreferencia2(int telreferencia2) {
        this.telreferencia2 = telreferencia2;
    }

    public String getNombreReferencia1() {
        return nombreReferencia1;
    }

    public void setNombreReferencia1(String nombreReferencia1) {
        this.nombreReferencia1 = nombreReferencia1;
    }

    public String getNombreReferencia2() {
        return nombreReferencia2;
    }

    public void setNombreReferencia2(String nombreReferencia2) {
        this.nombreReferencia2 = nombreReferencia2;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getAdiccional() {
        return adiccional;
    }

    public void setAdiccional(String adiccional) {
        this.adiccional = adiccional;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }
    
    
    
    
    
    
}
