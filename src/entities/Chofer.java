package entities;

public class Chofer extends Cuenta{
    private boolean licencia;
    private boolean soat;

    public Chofer(String nombres, String apellidoPat, String apellidoMat, char genero, String telefono, String DNI ,String email, String contrasenia){
        super(nombres, apellidoPat, apellidoMat, genero, telefono, DNI, email, contrasenia);
        tipo ="Chofer";
    }
    public void confirmarViaje(){}
    public void llevarPasajero(){}
    public void confirmarPago(){}

}
