//Tatiana Ramirez y Esteban Peña
HeladoManager.java
import java.util.ArrayList;

public class HeladoManager {
    private ArrayList<Helado> listaHelados;

    public HeladoManager() {
        this.listaHelados = new ArrayList<>();
    }

    // CRUD
    public void agregarHelado(Helado h) {
        this.listaHelados.add(h);
    }

    public Helado buscarHeladoPorId(int id) {
        for (Helado h : listaHelados) {
            if (h.id == id) {
                return h;
            }
        }
        return null;
    }

    public void editarHelado(int id, float nuevoPrecio, ArrayList<String> nuevosSabores, int nuevoTipo) {
        Helado h = buscarHeladoPorId(id);
        if (h != null) {
            h.setPrecio(nuevoPrecio);
            h.setSabores(nuevosSabores);
            h.setTipo(nuevoTipo);
        }
    }

    public void eliminarHelado(int id) {
        Helado h = buscarHeladoPorId(id);
        if (h != null) {
            listaHelados.remove(h);
        }
    }

    public ArrayList<Helado> getListaHelados() {
        return this.listaHelados;
    }
}
