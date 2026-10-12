package repasoFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorArchivo {

    public static void escribirArchivo(){

        try{
            FileWriter conector = new FileWriter("GestionAcademica/entrada/alumnos.txt",true);

            BufferedWriter escritor = new BufferedWriter((conector));

            escritor.write("Daniela;Pernía;19;10");
            escritor.newLine();
            escritor.write("Daniel;Arias;24;6");
            escritor.newLine();
            escritor.write("Miguel;De La Iglesia;29;10");
            escritor.newLine();
            escritor.write("Sergio;Vega;19;9");
            escritor.newLine();
            escritor.write("Leo;Hoepp;25;8");
            escritor.newLine();
            escritor.write("Adrian;Garde;20;8");
            escritor.newLine();
            escritor.write("Victor;García;21;7");
            escritor.newLine();
            escritor.write("Alain;Ramirez;24;9");
            escritor.newLine();
            escritor.write("Samuel;Martinez;18;8");
            escritor.newLine();
            escritor.write("Mireia;Martinez;32;9");

            escritor.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
