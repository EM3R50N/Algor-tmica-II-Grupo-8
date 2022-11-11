import entities.Chofer;
import entities.Cuenta;
import entities.Pasajero;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import persistencia.JSONConfig;
import persistencia.Persitencia;
import processes.registroConfig;

public class AplicativoTaxi {
    static Scanner s = new Scanner(System.in);
    //static ArrayList<Chofer> chof = new ArrayList<Chofer>();
    //static ArrayList<Pasajero> pasa = new ArrayList<Pasajero>();
    static registroConfig config = new registroConfig();
    static JSONConfig r = new JSONConfig();
    public static void main(String[] args) {


        Persitencia persitencia = new JSONConfig();
        persitencia.leerConfig(config);

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
        if(opc ==1 || opc == 2) {
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
                if (config.crearPasajero(p) == 0){
                    System.out.println("Cuenta Pasajero agregada");
                } else {
                    System.out.println("Cuenta Pasajero ya existe");
                }
            } else if(opc ==2){
                Chofer c = new Chofer(nombres, apellidoPat, apellidoMat, genero, telefono, DNI, email, contrasenia);
                if (config.crearChofer(c) == 0){
                    System.out.println("Cuenta Chofer agregada");
                } else {
                    System.out.println("Cuenta Chofer ya existe");
                }
            }
        }
    }
    public static void IniciarSesion(){
        System.out.println("");
        System.out.println("Ingrese su email");
        String email = s.next();
        System.out.println("Ingrese su contrasenia");
        String contrasenia = s.next();
        config.iniciarSesion(email, contrasenia);
    }
    public static void salirApp(){
        System.out.println("");
        System.out.println("Gracias por usar KeyCab!");
    }
}