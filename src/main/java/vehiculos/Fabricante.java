package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    int cantidadFabricados;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();


    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        Fabricante.fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante maxVendedor = fabricantes.get(0);
        for(Fabricante fabricante: fabricantes){
            if(fabricante.cantidadFabricados > maxVendedor.cantidadFabricados){
                maxVendedor = fabricante;
            }
        }
        return maxVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getCantidadFabricados() {
        return cantidadFabricados;
    }

    public void setCantidadFabricados(int cantidadFabricados) {
        this.cantidadFabricados = cantidadFabricados;
    }

    public static ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
        Fabricante.fabricantes = fabricantes;
    }
}
