package ut01;
//Práctica realizada por Sara Panés de Hita
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("C:\\Users\\Usuario\\IdeaProjects\\Acceso_datos\\src\\ut01\\curso.dat");
        File archivoAl = new File("C:\\Users\\Usuario\\IdeaProjects\\Acceso_datos\\src\\ut01\\alumno.dat");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
                Curso curso[] = new Curso[5];
                curso[0] = new Curso("3678","Iniciación a la red Internet",
                        60,"2018-10-01","2018-10-15");
                curso[1] = new Curso("3609","Informática de usuario",200,
                        "2018-10-20","2018-12-04");
                curso[2] = new Curso("2758","Informática de usuario",200,
                        "2018-12-09","2019-02-04");
                curso[3] = new Curso("3689","Gobernanta/e de hotel",615,
                        "2018-10-18","2019-03-18");
                curso[4] = new Curso("3668","Empleado de oficina",790,
                        "2018-10-18","2019-05-14");
            for (int i = 0;i<=4;i++){
                oos.writeObject(curso[i]);
            }
            oos.close();
            ObjectOutputStream oosAl = new ObjectOutputStream(new FileOutputStream(archivoAl));
            Alumno alumno = new Alumno("44897552K","Sara","Panés","de Hita","C/Calle N","35001",
                    "Las Palmas","689552147","1994-08-17");
            oosAl.writeObject(alumno);
            oosAl.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
