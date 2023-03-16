
package modelo;

public class Carreras {
    
    private int id_carrera;
    private String nombre;
    private String descripcion;

    public Carreras() {
    }
   

    public Carreras(int id_carrera, String nombre, String descripcion) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return id_carrera +"-"+nombre;
    }
    
    
    
    
}
