package repasoFicheros;

import java.io.FileNotFoundException;

public class EjercicioFicheros {

    public static void main(String[] args) throws FileNotFoundException {
    Alumnos alumnos = new Alumnos();

    CrearEstructura.generarEstructura();
    alumnos.alumnos();
    CopiaDeSeguridad.realizarBackup();
    ComprobacionFinal.comprobar();
    }
}
