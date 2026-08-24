public class Posicion {
    private int longitud;
    private int latitud;
    public Posicion(int longitud, int latitud) {
        if (longitud < -100 || longitud > 100) {
            throw new IllegalArgumentException("Longitud fuera del rango");
        }
        if (latitud < -100 || latitud > 100) {
            throw new IllegalArgumentException("Latitud fuera del rango");
        }
        this.longitud = longitud;
        this.latitud = latitud;
    }
    public int getLongitud() {
        return longitud;
    }
    public int getLatitud() {
        return latitud;
    }
}
