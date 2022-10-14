package entities;

public class Chofer extends Cuenta{
    private boolean licencia;
    private boolean soat;

    public Chofer(String nombre, String apellidoP, String apellidoM, String telefono, String DNI, char genero, String tipo){
        super(nombre, apellidoP, apellidoM, telefono, DNI, genero, tipo);
        tipo ="Chofer";
    }
    public void confirmarViaje(){}
    public void llevarPasajero(){}
    public void confirmarPago(){}

}
