package repasoFicheros;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Alumnos {

    public void alumnos() throws FileNotFoundException {

        try {
            FileReader conector = new FileReader("GestionAcademica/entrada/alumnos.txt");
            BufferedReader lector = new BufferedReader(conector);

            String linea;

            while ((linea = lector.readLine()) != null){
                String[] datos = linea.split(";");

                String nombre = datos[0];
                String apellido = datos[1];
                String edad = datos[2];
                String nota = datos[3];

               double notaNumero = Double.parseDouble(nota);
               String resultado;
               String ruta;

                if(notaNumero >= 5){
                    resultado = "Aprobado";
                    System.out.println("Está aprobado/a");
                    ruta = "GestionAcademica/expedientes/aprobados/" + nombre + "_" + apellido + ".txt";
                } else {
                    resultado = "Suspenso";
                    System.out.println("Está suspenso/a");
                    ruta = "GestionAcademica/expedientes/suspensos/" + nombre + "_" + apellido + ".txt";
                }

                BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta));

                escritor.write("Nombre: " + nombre);
                escritor.newLine();
                escritor.write("Apellido: " + apellido);
                escritor.newLine();
                escritor.write("Edad: " + edad);
                escritor.newLine();
                escritor.write("Nota: " + nota);
                escritor.newLine();
                escritor.write("Resultado: " + resultado);

                escritor.close();

            }
            lector.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
