public class PortaAviones {
    private int numero;
    private int capacidad;
    private Posicion ubicacion;
    private final int tripulantesMinimos;
    private int puntaje;
    public PortaAviones(int numero, int capacidad, int tripulantesMinimos, int puntaje) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.tripulantesMinimos = tripulantesMinimos;
        this.puntaje = puntaje;
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