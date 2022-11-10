import entities.Chofer;
import entities.Pasajero;

import java.util.ArrayList;
import java.util.Scanner;
public class AplicativoTaxi {
    static ArrayList<Chofer> chof = new ArrayList<Chofer>();
    static ArrayList<Pasajero> pasa = new ArrayList<Pasajero>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        System.out.println("Bienvenido seleccione el menu el cual ingresar");
        do{
            imprimirMenuInicial();
            option= s.nextInt();
            switch(option){
                case 1: registro(); break;
                case 2: IniciarSesion(); break;
                case 3: salirApp(); break;
            }
        }
        while(option !=3);
    }

    public static void imprimirMenuInicial() {
        System.out.println("");
        System.out.println("Presione 1 para registarse");
        System.out.println("Presione 2 para iniciar sesion");
        System.out.println("Presione 3 para salir de la aplicacion");
    }

    public static void registro() {
        System.out.println("Menu de registro proceda a llenar sus datos");
        System.out.println("Presione 1 para registarse como Pasajero");
        System.out.println("Presione 2 para registarse como Chofer");
        System.out.println("Presione 3 o otro numero para salir");
        int opc = s.nextInt();
        while (opc != 3) {
            System.out.println("");
            System.out.println("Llene sus datos basicos");
            System.out.println("Nombres");
            String nombres = s.next();
            System.out.println("Apellido Paterno");
            String apellidoPat = s.next();
            System.out.println("Apellido Materno");
            String apellidoMat = s.next();
            System.out.println("Genero M/F/N");
            char genero = s.next().charAt(0);
            System.out.println("Numero de Telefono");
            String telefono = s.next();
            System.out.println("Numero DNI");
            String DNI = s.next();
            System.out.println("correo electronico");
            String email = s.next();
            System.out.println("Digite una contraseña");
            String contrasenia = s.next();
            if (opc == 1) {
                Pasajero p = new Pasajero(nombres, apellidoPat, apellidoMat, genero, telefono, DNI, email, contrasenia);
                pasa.add(p);
            } else if(opc ==2){
                Chofer c = new Chofer(nombres, apellidoPat, apellidoMat, genero, telefono, DNI, email, contrasenia);
                chof.add(c);
            }
        }
    }
    public static void IniciarSesion(){

    }
    public static void salirApp(){
        System.out.println("");
        System.out.println("Gracias por usar KeyCab!");
    }
}