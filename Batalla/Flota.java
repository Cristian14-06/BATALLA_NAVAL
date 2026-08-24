import java.util.ArrayList;
public class Flota {
    private String nombre;
    private final String codigo;
    private ArrayList<Barco> barcos;
    private ArrayList<PortaAviones> portaAviones;
    private ArrayList<Avion> aviones;
    private Tablero tablero;
    public Flota(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        barcos = new ArrayList<Barco>();
        portaAviones = new ArrayList<PortaAviones>();
        aviones = new ArrayList<Avion>();
    }
    public String getCodigo() {
        return codigo;
    }
    public ArrayList<Barco> getBarcos() {
        return barcos;
    }
    public ArrayList<PortaAviones> getPortaAviones() {
        return portaAviones;
    }
    public ArrayList<Avion> getAviones() {
        return aviones;
    }
    public Tablero getTablero() {
        return tablero;
    }
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    public boolean problemaEnAire() {
        for (Flota flota : tablero.getFlotas()) {
            if (flota != this) {
                for (Avion avion : aviones) {
                    if (avion.isEnAire()) {
                        for (Avion avionEnemigo : flota.getAviones()) {
                            if (avionEnemigo.isEnAire()
                                    && avion.getPlaca().equals(avionEnemigo.getPlaca())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean esBuenAtaque(int longitud, int latitud) {
        if (!seranDestruidas(longitud, latitud).isEmpty()) {
            return false;
        }
        for (Flota flota : tablero.getFlotas()) {
            if (flota != this) {
                if (!flota.seranDestruidas(longitud, latitud).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList<Object> seranDestruidas(int longitud, int latitud) {
        ArrayList<Object> resultado = new ArrayList<Object>();
        for (Barco barco : barcos) {
            if (barco.getUbicacion().getLongitud() == longitud
                    && barco.getUbicacion().getLatitud() == latitud) {
                resultado.add(barco);
            }
        }
        for (PortaAviones portaAvion : portaAviones) {
            if (portaAvion.getUbicacion().getLongitud() == longitud
                    && portaAvion.getUbicacion().getLatitud() == latitud) {
                resultado.add(portaAvion);
            }
        }
        for (Avion avion : aviones) {
            if (!avion.isEnAire()) {
                if (avion.getUbicacion().getLongitud() == longitud
                        && avion.getUbicacion().getLatitud() == latitud) {
                    resultado.add(avion);
                }
            }
        }
        return resultado;
    }
}