package ut01;
//Práctica realizada por Sara Panés de Hita
import java.io.Serializable;
import java.util.Date;

public class Alumno implements Serializable {
    private String dni;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String codigoPosta;
    private String provincia;
    private String telefono;
    private String fechaNacimiento;
    public Alumno(String dni,String nombre,String primerApellido,
                  String segundoApellido,String direccion,String codigoPosta,
                  String provincia,String telefono,String fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.codigoPosta = codigoPosta;
        this.provincia = provincia;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPosta() {
        return codigoPosta;
    }

    public void setCodigoPosta(String codigoPosta) {
        this.codigoPosta = codigoPosta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String toString(){
        return (dni+primerApellido+segundoApellido+direccion+
                codigoPosta+provincia+telefono+fechaNacimiento);
    }
}
