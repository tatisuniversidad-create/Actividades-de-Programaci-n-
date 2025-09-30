//Tatiana Ramirez Y Esteban Peña 
MalteadaManager.java

import java.util.ArrayList;

public class MalteadaManager {
    private ArrayList<Malteada> listaMalteadas;

    public MalteadaManager() {
        this.listaMalteadas = new ArrayList<>();
    }

    public void agregarMalteada(Malteada m) {
        this.listaMalteadas.add(m);
    }

    public Malteada buscarMalteadaPorId(int id) {
        for (Malteada m : listaMalteadas) {
            if (m.id == id) {
                return m;
            }
        }
        return null;
    }

    public void eliminarMalteada(int id) {
        Malteada m = buscarMalteadaPorId(id);
        if (m != null) {
            listaMalteadas.remove(m);
        }
    }

    public ArrayList<Malteada> getListaMalteadas() {
        return listaMalteadas;
    }
}
