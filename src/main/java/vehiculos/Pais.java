package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private int unidadesVendidas;
    private static ArrayList<Pais> paises = new ArrayList<>();


    public Pais(String nombre) {
        this.nombre = nombre;
        Pais.paises.add(this);
    }

    public static Pais paisMasVendedor(){
        Pais maxVendedor = paises.get(0);
        for(Pais pais: paises){
            for(Fabricante fabricante: pais.fabricantes){
                pais.unidadesVendidas += fabricante.cantidadFabricados;
            }
            if(pais.unidadesVendidas > maxVendedor.unidadesVendidas){
                maxVendedor = pais;
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

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(ArrayList<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public static ArrayList<Pais> getPaises() {
        return paises;
    }

    public static void setPaises(ArrayList<Pais> paises) {
        Pais.paises = paises;
    }
}
