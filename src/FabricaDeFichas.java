public class FabricaDeFichas {
    //las fichas se crean una sola vez y se guardan en un HashMap
    private java.util.HashMap<String, Ficha> fichas = new java.util.HashMap<>();
    public Ficha obtenerFicha(String color) {
        Ficha ficha = fichas.get(color);
        if (ficha == null) {
            ficha = new FichaConcreta(color);
            fichas.put(color, ficha);
        }
        return ficha;
    }
}
