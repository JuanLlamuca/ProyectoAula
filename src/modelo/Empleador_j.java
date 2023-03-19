package modelo;

/**
 *
 * @author Josue
 */
public class Empleador_j {
    
    private int emp_cedula;
    private String emp_nombres;
    private String emp_apellidos;
    private String emp_correo;
    private String emp_nomEmpresa;
    private String emp_laboCum;
    private String emp_ubiEmpEmpresa;
    private int emp_telEmpresa;
    private String emp_corrEmpresa;
    private String emp_desEmpresa;
    private String emp_clave;
    
    public Empleador_j(){
    }
    
     public Empleador_j(int emp_cedul,String emp_nombres,String emp_apellidos, String emp_correo,String emp_nomEmpresa,String emp_laboCum,String emp_ubiEmpEmpresa,
            int emp_telEmpresa,String emp_corrEmpresa,String emp_desEmpresa,String emp_clave)
    {
        this.emp_cedula = emp_cedul;
        this.emp_nombres = emp_nombres;
        this.emp_apellidos = emp_apellidos;
        this.emp_correo = emp_correo;
        this.emp_nomEmpresa = emp_nomEmpresa;
        this.emp_laboCum = emp_laboCum; 
        this.emp_ubiEmpEmpresa = emp_ubiEmpEmpresa;
        this.emp_telEmpresa = emp_telEmpresa;
        this.emp_corrEmpresa = emp_corrEmpresa;
        this.emp_desEmpresa = emp_desEmpresa;
        this.emp_clave = emp_clave;     
    }
    
    //Cedula
     public int getEmp_ced() {
        return emp_cedula;
    }

    public void setEmp_ced(int emp_cedul) {
        this.emp_cedula = emp_cedul;
    }
    //Nombre
    public String getEmp_nombre() {
        return emp_nombres;
    }

    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombres = emp_nombre;
    }
    //Apellido
    public String getEmp_apellido() {
        return emp_apellidos;
    }
    
    public void setEmp_apellido(String emp_apellido) {
        this.emp_apellidos = emp_apellido;
    }
    //Correo
    public String getEmp_correo(){
        return emp_correo;
    }
    public void setEmp_correo(String emp_correo){
        this.emp_correo = emp_correo;
    }
    //Nombre de la empresa
    public String getEmp_nomEmp(){
        return emp_nomEmpresa;
    }
    public void setEmp_nomEmp(String emp_nomEmp){
        this.emp_nomEmpresa = emp_nomEmp;
    }
    //Labor que cumple en la empresa
    public String getEmp_laboCum(){
        return emp_laboCum;
    }
    public void setEmp_laboCum(String emp_laboCum){
        this.emp_laboCum = emp_laboCum;
    }
    //Ubicacion de la empresa
    public String getEmp_ubiEmp(){
        return emp_ubiEmpEmpresa;
    }
    public void setEmp_ubiEmp(String emp_ubiEmp){
        this.emp_ubiEmpEmpresa = emp_ubiEmp;
    }
    //Telefono de la empresa
    public int getEmp_telfEmp(){
        return emp_telEmpresa;
    }
    public void setEmp_telfEmp(int emp_telEmp){
        this.emp_telEmpresa = emp_telEmp;
    }
    //Correo de la empresa
    public String getEmp_corrEmp(){
        return emp_corrEmpresa;
    }
    public void setEmp_corrEmp(String emp_corrEmp){
        this.emp_corrEmpresa = emp_corrEmp;
    }
    //Descripción de la empresa
    public String getEmp_desEmp(){
        return emp_desEmpresa;
    }
    public void setEmp_desEmp(String emp_descEmp){
        this.emp_desEmpresa = emp_descEmp;
    }
    //Clave del LOGIN empleador
    public String getEmp_clave() {
        return emp_clave;
    }
    public void setEmp_clave(String emp_clave) {
        this.emp_clave = emp_clave;
    }
}
