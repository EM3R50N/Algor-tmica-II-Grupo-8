package entities;
import java.util.Vector;

public class Cuenta {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;
    private String email;
    private String contrasenia;
    private String DNI;
    private int diaNac;
    private int mesNac;
    private int anioNac;
    private char genero;
    protected String tipo;
    protected Vector<Viaje> viaje;

    public Cuenta(String nombre, String apellidoP, String apellidoM, String telefono, String DNI, char genero, String tipo) {
        this.nombre =nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        this.telefono=telefono;
        this.DNI=DNI;
        this.genero=genero;
        this.tipo=tipo;
        viaje= new Vector<Viaje>();
    }
    protected String getInfoCuenta(){
        return tipo;
    }
    public void registrarCuenta(){}
    public void iniciarSesion(){}
    public void cerrarSesion(){}
    public void mostrarDatos(){}
    public void actualizarDatos(){}
    public void registrarViajes(){}
    public void mostrarViajes(){}


}
