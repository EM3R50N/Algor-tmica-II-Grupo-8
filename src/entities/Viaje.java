package entities;

public class Viaje {
    private String codViaje;
    private Usuario usuario;
    private Ruta ruta;
    private Double monto;
    private double progreso;
    private int tMin;
    private int tHora;
    private boolean completado;
    public boolean getCompletado(){
        return completado;
    }
}
