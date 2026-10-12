package repasoPOO;

public class Main {
    public static void main(String[] args){

        //1. Creo una variable de tipo coche
        //2. Empiezo a crear un objeto de tipo coche al que apunte la variable con el operador new
        //3.

        //instanciar usando el constructor con parámetros
        Coche miCoche = new Coche ("Daewoo", "Lacetti", "azul", "gasolina");
        Coche cocheDani = new Coche ("Mazda", "3", "gris", "hibrido");
        Coche cocheMiguel = new Coche ("Ford", "Focus", "azul", "diesel");

        Coche cocheExtra = new Coche();
        cocheExtra.setMarca("Daewoo");
        cocheExtra.setColor("rojo");
        cocheExtra.setModelo("Focus");
        cocheExtra.setCombustible("Gasolina");

        System.out.println("Coche 1 " + miCoche);
        System.out.println("Coche 2 " + cocheDani);
        System.out.println("Coche 3 " + cocheMiguel);
        System.out.println("Coche 4 " + cocheExtra);

        System.out.println("¿ El coche 1 es igual al coche 4? " + miCoche.equals(cocheExtra));

        System.out.println("Total de coches: " + Coche.getContadorCoches());
    }
}
