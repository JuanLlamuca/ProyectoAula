package modelo;

import java.sql.Blob;

public class HojaVida {
    private int hoj_id; //1
    private int cedula; //2
    private String nombre; //3
    private String genero;  //4
    private String estadoCivil;  //5
    private String canton;  //6
    private String ciudad;  //7
    private String direccion;  //8
    private int telefonoPersonal; //9
    private String correo;  //10
    private String descripcion;  //11 
    private String formacion;  //12
    private String experiencia; //13
    private int telreferencia1; //14
    private int telreferencia2; //15
    private String nombreReferencia1;  //16
    private String nombreReferencia2;  //17
    private String habilidades;  //18
    private String adiccional;  //19
    private byte [] imagen; //20

   

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


    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    
    
    
}
