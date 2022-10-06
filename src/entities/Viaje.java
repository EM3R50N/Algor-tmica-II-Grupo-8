package entities;

public class Viaje {
    private String ID;
    private Usuario usuario;
    private Ruta ruta;
    private Double monto;
    private double progreso;
    private boolean completado;
    public boolean getCompletado(){
        return completado;
    }
}
