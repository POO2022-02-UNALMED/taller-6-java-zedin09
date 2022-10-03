package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volvo;
    private static int cantidadCamionetas;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,boolean volvo) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volvo = volvo;
        Camioneta.cantidadCamionetas += 1;
    }

    public boolean isVolvo() {
        return volvo;
    }

    public void setVolvo(boolean volvo) {
        this.volvo = volvo;
    }

    public static int getCantidadCamionetas() {
        return Camioneta.cantidadCamionetas;
    }

    public static void setCantidadCamionetas(int cantidadCamionetas) {
        Camioneta.cantidadCamionetas = cantidadCamionetas;
    }
}
