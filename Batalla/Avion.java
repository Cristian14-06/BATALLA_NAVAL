public class Avion {
    private String placa;
    private boolean enAire;
    private Posicion ubicacion;
    private final int tripulantesMinimos;
    private int puntaje;
    public Avion(String placa, boolean enAire,
                 int tripulantesMinimos, int puntaje) {
        this.placa = placa;
        this.enAire = enAire;
        this.tripulantesMinimos = tripulantesMinimos;
        this.puntaje = puntaje;
    }
    public String getPlaca() {
        return placa;
    }
    public boolean isEnAire() {
        return enAire;
    }
    public Posicion getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Posicion ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getTripulantesMinimos() {
        return tripulantesMinimos;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}