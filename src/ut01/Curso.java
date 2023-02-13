package ut01;
//Práctica realizada por Sara Panés de Hita
import java.io.Serializable;
import java.util.Date;

public class Curso implements Serializable {
    private String codigo;
    private String denominacion;
    private int numHoras;
    private String fechaInicio;
    private String fechaFin;

    public Curso(String codigo,String denominacion,int numHoras,
                 String fechaInicio,String fechaFin){
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.numHoras = numHoras;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String toString(){
        return(codigo + denominacion + numHoras + fechaInicio +
                fechaFin);
    }
}
