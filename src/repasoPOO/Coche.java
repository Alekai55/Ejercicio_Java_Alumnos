package repasoPOO;

public class Coche{
    private String marca;
    private String modelo;
    private String color;
    private String combustible;

    private static int contadorCoches =0;

    //constructor para tener un coche en blanco
    public Coche(){
        contadorCoches++;
    }
    //constructor para configurar un coche desde el principio
    public Coche(String marca, String modelo, String color, String combustible){
        //this lo que hace es apuntar al mismo objeto
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        contadorCoches++; //hay que indicarlo para que lo sume al configurar un coche
    }

    //metodo para decir que el coche está arrancando
    public void arrancar(){
        System.out.println("El " + this.modelo + " de la marca " + this.marca + "está arrancando");
    }
    //metodo para pintar el coche
    public void pintar(String nuevoColor){
        this.color = nuevoColor;
        System.out.println("El coche ahora es de color " + this.color );
    }

    //Esto son los Getters(leer/obtener) & Setters(modificar) que sirven para leer y modificar los atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public static int getContadorCoches() {
        return contadorCoches;
    }

    public static void setContadorCoches(int contadorCoches) {
        Coche.contadorCoches = contadorCoches;
    }

    //esto es el metodo toString
    @Override
    public String toString() {
        return super.toString();
    }

    //esto es el metodo equals
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}