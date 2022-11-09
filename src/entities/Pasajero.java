package entities;

public class Usuario extends Cuenta{

    public Usuario(String nombre, String apellidoP, String apellidoM, String telefono, String DNI, char genero, String tipo){
        super(nombre, apellidoP, apellidoM, telefono, DNI, genero, tipo);
        tipo="Usuario";
    }
    public void solicitarViaje(){}
    public void cancelarViaje(){}
    public void pagarViaje(){}
    public void consultarProgreso(){}
}