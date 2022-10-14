import entities.Cuenta;
import entities.Chofer;
import entities.Usuario;
import java.util.Scanner;
public class AplicativoTaxi {
    public static void main(String[] args) {
        int option;
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido");
        do{
            imprimirMenuInicial();
            option= s.nextInt();
            switch(option){
                case 1: registro(); break;
                case 2: IniciarSesion(); break;
                case 3: salir(); break;
            }
        }
        while(option !=3);
    }

    public static void imprimirMenuInicial(){
        System.out.println("");
        System.out.println("Presione 1 para registrarse");
        System.out.println("Presione 2 para Iniciar Sesion");
        System.out.println("Presione 3 para Salir de la Aplicacion");

    }
    public static void registro(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese Nombre y Apellidos");
        String nombre = s.next();
        String apellidoP =s.next();
        String apellidoM =s.next();
        System.out.println("Ingrese numero de telefono");
        String telefono = s.next();
        System.out.println("Ingrese DNI");
        String DNI = s.next();
        System.out.println("Ingrese su genero M/F");
        String genero = s.next();

    }
    public static void IniciarSesion(){

    }
    public static void imprimirMenuCuenta(){
        System.out.println("");
        System.out.println("Presione 1 Iniciar Viaje");
        System.out.println("Presione 2 para mostrar su historial de viajes");
        System.out.println("Presione 3 para mostrar Datos");
        System.out.println("Presione 4 para actualizar sus Datos");
        System.out.println("Presione 5 para cerrar Sesion");
    }
    public static void salir(){
        System.out.println("");
        System.out.println("Gracias por usar KeyCab!");
    }
}