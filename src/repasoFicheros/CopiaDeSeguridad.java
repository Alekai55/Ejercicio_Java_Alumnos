package repasoFicheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopiaDeSeguridad {

    public static void realizarBackup() {
        try {
            BufferedReader lector = new BufferedReader(
                    new FileReader("GestionAcademica/entrada/alumnos.txt")
            );
            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter("GestionAcademica/backup/alumnos_backup.txt")
            );

            String linea;

            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
            }
            lector.close();
            escritor.close();

        }
        catch (IOException e){
            System.out.println("Error al realizar copia de seguridad");
        }
    }
}
