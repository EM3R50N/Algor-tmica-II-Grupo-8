package entities;
import java.util.Vector;

public class Cuenta {
    private String nombres;
    private String apellidoPat;
    private String apellidoMat;
    private String telefono;
    private String email;
    private String contrasenia;
    private String DNI;
    //private int diaNac;//private int mesNac;//private int anioNac; remplazar por date
    private char genero;
    protected String tipo;
    protected Vector<Viaje> viaje;

    public Cuenta(String nombres, String apellidoPat, String apellidoMat, char genero, String telefono, String DNI ,String email, String contrasenia) {
        this.nombres = nombres;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.genero = genero;
        this.telefono = telefono;
        this.DNI = DNI;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public void registrarCuenta(){}
    public void iniciarSesion(){}
    public void cerrarSesion(){}
    public void mostrarDatos(){}
    public void actualizarDatos(){}
    public void registrarViajes(){}
    public void mostrarViajes(){}


}
