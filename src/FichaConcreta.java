public class FichaConcreta implements Ficha{
    private String color;
    public FichaConcreta(String color){
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void mostrar(int x, int y) {
        System.out.println("Ficha de color " + color + " en la posicion (" + x + "," + y + ")");
    }
    public void mostrar(int x, int y, String mensaje) {
        System.out.println(mensaje);
        System.out.println("Ficha de color " + color + " en la posicion (" + x + "," + y + ")");
    }
}
