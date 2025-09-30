//Tatiana Ramirez Y Esteban Peña 
HeladeriaManager.java
import java.util.ArrayList;

public class HeladeriaManager {
    private ArrayList<Heladeria> listaHeladerias;

    public HeladeriaManager() {
        this.listaHeladerias = new ArrayList<>();
    }

    public void agregarHeladeria(Heladeria h) {
        this.listaHeladerias.add(h);
    }

    public Heladeria buscarHeladeriaPorId(int id) {
        for (Heladeria h : listaHeladerias) {
            if (h.id == id) {
                return h;
            }
        }
        return null;
    }

    public void editarHeladeria(int id, String nuevaDireccion) {
        Heladeria h = buscarHeladeriaPorId(id);
        if (h != null) {
            h.setDireccion(nuevaDireccion);
        }
    }

    public void eliminarHeladeria(int id) {
        Heladeria h = buscarHeladeriaPorId(id);
        if (h != null) {
            listaHeladerias.remove(h);
        }
    }

    public ArrayList<Heladeria> getListaHeladerias() {
        return listaHeladerias;
    }
}
