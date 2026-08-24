import java.util.ArrayList;
public class Tablero {
    private ArrayList<Flota> flotas;
    public Tablero() {
        flotas = new ArrayList<Flota>();
    }
    public ArrayList<Flota> getFlotas() {
        return flotas;
    }
    public void agregarFlota(Flota flota) {
        flotas.add(flota);
        flota.setTablero(this);
    }
}
