package entities;
import java.util.Vector

public class Cuenta {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String email;
    private String contrasenia;
    private String DNI;
    private int diaNac;
    private int mesNac;
    private int anioNac;
    private char genero;
    protected String tipo;
    protected Vector<Viaje> viaje;
    public void registrarCuenta(){}
    public void iniciarSesion(){}
    public void actualizarDatos(){}
    public void registrarViajes(){}
    public void mostrarViajes(){}

}
