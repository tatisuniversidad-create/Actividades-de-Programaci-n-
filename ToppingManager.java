//Tatiana Ramirez Y Esteban Peña 
ToppingManager.java
import java.util.ArrayList;

public class ToppingManager {
    private ArrayList<String> listaToppings;

    public ToppingManager() {
        this.listaToppings = new ArrayList<>();
    }

    public void agregarTopping(String topping) {
        this.listaToppings.add(topping);
    }

    public void eliminarTopping(String topping) {
        this.listaToppings.remove(topping);
    }

    public ArrayList<String> getListaToppings() {
        return this.listaToppings;
    }
}
