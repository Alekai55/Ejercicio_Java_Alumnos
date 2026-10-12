    package repasoFicheros;

    import java.io.File;
    import java.io.IOException;

    public class CrearEstructura {

        public static void generarEstructura() {

            File carpeta = new File("GestionAcademica/entrada");
            File carpeta1 = new File("GestionAcademica/expedientes");
            File carpeta2 = new File("GestionAcademica/informes");
            File carpeta3 = new File("GestionAcademica/backup");

            if (!carpeta.exists()){
                carpeta.mkdirs();
                System.out.println("Directorio principal creado");
            } if (!carpeta1.exists()) {
                carpeta1.mkdirs();
                System.out.println("Directorio expedientes creado");
            } if (!carpeta2.exists()) {
                carpeta2.mkdirs();
                System.out.println("Directorio informes creado");
            } if (!carpeta3.exists()) {
                carpeta3.mkdirs();
                System.out.println("Directorio backup creado");
            }

            File carpetaAprobados = new File("GestionAcademica/expedientes/aprobados");
            File carpetaSuspensos = new File("GestionAcademica/expedientes/suspensos");

            if (!carpetaAprobados.exists()){
                carpetaAprobados.mkdir();
                System.out.println("Carpeta aprobados creada correctamente");
            }

            if (!carpetaSuspensos.exists()){
                carpetaSuspensos.mkdir();
                System.out.println("Carpeta suspensos creada correctamente");
            }

            File archivo = new File("GestionAcademica/entrada/alumnos.txt");
            File archivo1 = new File("GestionAcademica/informes/resumen.txt");
            File archivo2 = new File("GestionAcademica/informes/historico.txt");
            File archivo3 = new File("GestionAcademica/backup/alumnos_backup.txt");

            try{
                if (!archivo.exists()){
                    archivo.createNewFile();
                    //He anidado la funcón escribirArchivo porque al crearlo en el main se me añadían constantemente la lista de alumnos
                    EscritorArchivo.escribirArchivo();
                    System.out.println("archivo alumnos.txt creado correctamente");


                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
            try{
                if (!archivo1.exists()){
                    archivo1.createNewFile();
                    System.out.println("archivo resumen.txt creado correctamente");
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
            try{
                if (!archivo2.exists()){
                    archivo2.createNewFile();
                    System.out.println("archivo historico.txt creado correctamente");
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
            try{
                if (!archivo3.exists()){
                    archivo3.createNewFile();
                    System.out.println("archivo alumnos_backup.txt creado correctamente");
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

