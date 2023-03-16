
package modelo;



public class Postulante {
    private int cedula;
    private String nombres;
    private String apellidos;
    private int telefonoP;
    private int telefonoD;
    private String correo;
    private String direccion;
    private String eduacion;
    private String nacimiento;
    private int carrera;

    public Postulante() {
    }
    
    public Postulante(int cedula, String nombres, String apellidos, int telefonoP, int telefonoD, String correo, String direccion, String eduacion, String nacimiento, int carrera) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefonoP = telefonoP;
        this.telefonoD = telefonoD;
        this.correo = correo;
        this.direccion = direccion;
        this.eduacion = eduacion;
        this.nacimiento = nacimiento;
        this.carrera = carrera;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(int telefonoP) {
        this.telefonoP = telefonoP;
    }

    public int getTelefonoD() {
        return telefonoD;
    }

    public void setTelefonoD(int telefonoD) {
        this.telefonoD = telefonoD;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEduacion() {
        return eduacion;
    }

    public void setEduacion(String eduacion) {
        this.eduacion = eduacion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
    
    
    
    
    
}
