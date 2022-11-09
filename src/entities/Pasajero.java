package entities;

public class Pasajero extends Cuenta{
    public Pasajero(String nombres, String apellidoPat, String apellidoMat, char genero, String telefono, String DNI ,String email, String contrasenia){
        super(nombres, apellidoPat, apellidoMat, genero, telefono, DNI, email, contrasenia);
        tipo ="Pasajero";
    }
    public void solicitarViaje(){}
    public void cancelarViaje(){}
    public void pagarViaje(){}
    public void consultarProgreso(){}
}