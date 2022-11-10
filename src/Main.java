public class Main {
    public static void main(String[] args) {

        //Primera parte: Llamar a la función en el main y darle valores.
        suma (12,2,3);

        //Segunda parte: Crear un objeto miCoche en el main y añadirle una puerta.
        coche renault = new coche();
        renault.anadirpuerta();
        //Segunda parte: Mostrar el número de puertas que tiene el objeto.
        System.out.println(renault.puertas);
    }

    //Primera parte: Crear una función con tres parámetros que sean números que se suman entre sí.
    public static void suma(int a, int b, int c) {
        int suma = a+b+c;
        System.out.println(suma);
    }

}
    //Segunda parte: Crear una clase coche.
    class coche {
        //Segunda parte: Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        public int puertas = 0;
        //Segunda parte: Una función que incremente el número de puertas que tiene el coche.
        public void anadirpuerta() {
        this.puertas++;
    }

}