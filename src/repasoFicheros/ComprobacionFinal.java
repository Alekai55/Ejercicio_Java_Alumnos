package repasoFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

    public class ComprobacionFinal {

        public static void comprobar() {
            File carpetaAprobados = new File("GestionAcademica/expedientes/aprobados");
            File carpetaSuspensos = new File("GestionAcademica/expedientes/suspensos");

            File[] archivosAprobados = carpetaAprobados.listFiles();
            File[] archivosSuspensos = carpetaSuspensos.listFiles();

            int totalProcesados = contarAlumnos();
            int totalExpedientes = 0;

            System.out.println("Expedientes de alumnos aprobados:");

            if (archivosAprobados != null) {
                for (File archivo : archivosAprobados) {
                    if (archivo.isFile()) {
                        System.out.println(archivo.getName());
                        totalExpedientes++;
                    }
                }
            }

            System.out.println("Expedientes de alumnos suspensos:");

            if (archivosSuspensos != null) {
                for (File archivo : archivosSuspensos) {
                    if (archivo.isFile()) {
                        System.out.println(archivo.getName());
                        totalExpedientes++;
                    }
                }
            }

            File resumen = new File("GestionAcademica/informes/resumen.txt");
            File copia = new File("GestionAcademica/backup/alumnos_backup.txt");

            System.out.println("Alumnos procesados: " + totalProcesados);
            System.out.println("Expedientes encontrados: " + totalExpedientes);
            System.out.println("Informe generado correctamente: " + (resumen.exists() && resumen.length() > 0));
            System.out.println("Copia de seguridad generada correctamente: " + (copia.exists() && copia.length() > 0));
        }

        private static int contarAlumnos() {
            int total = 0;

            try {
                BufferedReader lector = new BufferedReader(
                        new FileReader("GestionAcademica/entrada/alumnos.txt")
                );

                while (lector.readLine() != null) {
                    total++;
                }

                lector.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return total;
        }
    }

