public class Main {
    public static void main(String[] args) {
        Rompecabezas rompecabezas = new Rompecabezas();
        //Agregar fichas de diferentes colores
        rompecabezas.agregarFicha("Rojo", 0, 0);
        rompecabezas.agregarFicha("Verde", 0, 1);
        rompecabezas.agregarFicha("Azul", 0, 2);
        rompecabezas.agregarFicha("Rojo", 1, 0);
        rompecabezas.agregarFicha("Verde", 1, 1);
        rompecabezas.agregarFicha("Azul", 1, 2);
        rompecabezas.agregarFicha("Rojo", 2, 0);
        rompecabezas.agregarFicha("Verde", 2, 1);
        //Agregar ficha de color Azul en la posicion (2,2) y usar la sobrecarga del metodo mostrar
        rompecabezas.agregarFicha("Azul", 2, 2, "Ubicando ficha Azul en la posicion final");
    }
}
