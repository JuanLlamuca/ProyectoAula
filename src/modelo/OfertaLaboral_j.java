package modelo;

import java.util.Date;

public class OfertaLaboral_j {

    private int id;
    private String titulo;
    private String area;
    private String descripcion;
    private String ubicacion;
    private String requisitos;
    private Double salario;
    private Date fechaInicio;
    private String jornada;
    private int cedulaEmpleador;
    private String solicitud;
    private Date fechaFin;
    
    public OfertaLaboral_j(){
    }
    
    public OfertaLaboral_j(int id, String titulo, String area, String descripcion,
    String ubicacion, String requisitos, Double salario, Date fechaInicio, String jornada,
    int cedulaEmpleador, String solicitud, Date fechaFin){
    
        this.id = id;
        this.titulo = titulo;
        this.area = area;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.requisitos = requisitos;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.jornada = jornada;
        this.cedulaEmpleador = cedulaEmpleador;
        this.solicitud = solicitud;
        this.fechaFin = fechaFin;
    }
    //motodos get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getCedulaEmpleador() {
        return cedulaEmpleador;
    }

    public void setCedulaEmpleador(int cedulaEmpleador) {
        this.cedulaEmpleador = cedulaEmpleador;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
