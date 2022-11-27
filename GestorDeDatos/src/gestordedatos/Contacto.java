
package gestordedatos;
public class Contacto {
    private String identificacion;
    private String nombre;
    private String apellido;
    public Contacto (String identificacion, String nombre, String apellido){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
