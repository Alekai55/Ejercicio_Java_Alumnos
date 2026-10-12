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

            int total = 0;
            int aprobados = 0;
            int suspensos = 0;
            double sumaNotas = 0;
            double notaMaxima = -1; //con ayuda de la IA me explicó que de esta forma se controla que al introducir
            double notaMinima = 11; //notas nuevas, estén siempre entre el máximo y el mínimo
            String alumnosNotaMaxima = "";
            String alumnosNotaMinima = "";


            while ((linea = lector.readLine()) != null){
                String[] datos = linea.split(";");

                String nombre = datos[0];
                String apellido = datos[1];
                String edad = datos[2];
                String nota = datos[3];

               double notaNumero = Double.parseDouble(nota);
               String resultado;
               String ruta;

               //Agregado sumatorio de notas
               total++;
               sumaNotas += notaNumero;

               if(notaNumero > notaMaxima) {
                   notaMaxima = notaNumero;
                   alumnosNotaMaxima = nombre + " " + apellido;
               } else if (notaNumero == notaMaxima) {
                   alumnosNotaMaxima += " " + nombre + " " + apellido;
               }

               if(notaNumero < notaMinima) {
                   notaMinima = notaNumero;
                   alumnosNotaMinima = nombre + " " + apellido;
               } else if (notaNumero == notaMinima) {
                   alumnosNotaMinima += " " + nombre + " " + apellido;

               }

                if(notaNumero >= 5){
                    resultado = "Aprobado";
                    System.out.println("Está aprobado/a");
                    ruta = "GestionAcademica/expedientes/aprobados/" + nombre + "_" + apellido + ".txt";
                    //añado suma de los aprobados y suspensos
                    aprobados++;
                } else {
                    resultado = "Suspenso";
                    System.out.println("Está suspenso/a");
                    ruta = "GestionAcademica/expedientes/suspensos/" + nombre + "_" + apellido + ".txt";
                    suspensos++;
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
            //Añado cálculo de la media fuera del bucle While

            double media = sumaNotas / total;

            BufferedWriter informe = new BufferedWriter(
                    new FileWriter("GestionAcademica/informes/resumen.txt")
            );

            informe.write("Total de alumnos: " + total);
            informe.newLine();
            informe.write("Aprobados: " + aprobados);
            informe.newLine();
            informe.write("Suspensos: " + suspensos);
            informe.newLine();
            informe.write("Nota media: " + media);
            informe.newLine();
            informe.write("Nota más alta: " + notaMaxima);
            informe.newLine();
            informe.write("Alumno(s) con la nota más alta: " + alumnosNotaMaxima);
            informe.newLine();
            informe.write("Nota más baja: " + notaMinima);
            informe.newLine();
            informe.write("Alumno(s) con la nota más baja: " + alumnosNotaMinima);

            informe.close();

            lector.close();
            guardarHistorico(total, aprobados, suspensos);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void guardarHistorico(int total, int aprobados, int suspensos) {
        try {
            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter("GestionAcademica/informes/historico.txt", true)
            );

            escritor.write("Alumnos procesados: " + total
                    + ", aprobados: " + aprobados
                    + ", suspensos: " + suspensos);
            escritor.newLine();
            escritor.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
