public class Barco {
    private int numero;
    private Posicion ubicacion;
    private final int tripulantesMinimos;
    private int puntaje;
    public Barco(int numero, int tripulantesMinimos, int puntaje) {
        this.numero = numero;
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
