class Rompecabezas {
    private FabricaDeFichas fabrica = new FabricaDeFichas();
    public void agregarFicha(String color, int x, int y) {
        Ficha ficha = fabrica.obtenerFicha(color);
        ficha.mostrar(x, y);
    }
    public void agregarFicha(String color, int x, int y, String mensaje){
        Ficha ficha = fabrica.obtenerFicha(color);
        if (ficha instanceof FichaConcreta) {
            ((FichaConcreta) ficha).mostrar(x, y, mensaje);
        } else {
            System.out.println("No se puede mostrar la ficha");
        }
    }
}
