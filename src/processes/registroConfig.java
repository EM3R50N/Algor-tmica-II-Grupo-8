package processes;
import entities.Cuenta;
import org.json.simple.JSONArray;
import entities.Chofer;
import entities.Pasajero;
import org.json.simple.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class registroConfig {
    private ArrayList<Chofer> choferes;
    private ArrayList<Pasajero> pasajeros;

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public registroConfig(){
        this.choferes = new ArrayList<Chofer>();
        this.pasajeros = new ArrayList<Pasajero>();
    }

    public int crearChofer(Chofer chofer){
        Enumeration<Chofer> cf = Collections.enumeration(choferes);
        while(cf.hasMoreElements()) {
            Chofer c = cf.nextElement();
            if( c.NombreCompleto().equals(c.NombreCompleto()) )
                return 1;
        }

        this.choferes.add((Chofer) chofer);
        return 0;
    }

    public int crearPasajero(Pasajero pasajero){
        Enumeration<Pasajero> psj = Collections.enumeration(pasajeros);
        while(psj.hasMoreElements()) {
            Pasajero p = psj.nextElement();
            if( p.NombreCompleto().equals(p.NombreCompleto()) )
                return 1;
        }
        this.pasajeros.add((Pasajero) pasajero);
        return 0;
    }
    public void buscarChofer(){
        Enumeration<Chofer> cf = Collections.enumeration(choferes);
        while(cf.hasMoreElements()) {
            Chofer c = cf.nextElement();
            System.out.println(c.NombreCompleto());
        }
    }

    public void buscarPasajero() {
        Enumeration<Pasajero> psj = Collections.enumeration(pasajeros);
        while (psj.hasMoreElements()) {
            Pasajero p = psj.nextElement();
            System.out.println(p.NombreCompleto());
        }
    }
    public JSONArray ChoferToJSON() {
        JSONArray arregloChofer = new JSONArray();
        Enumeration<Chofer> cf = Collections.enumeration(choferes);
        while(cf.hasMoreElements()){
            Chofer cfSgt = cf.nextElement();
            JSONObject obj = new JSONObject();
            obj.put("nombres", cfSgt.getNombres());
            obj.put("apellidoPat", cfSgt.getApellidoPat());
            obj.put("apellidoMat", cfSgt.getApellidoMat());
            obj.put("genero", cfSgt.getGenero());
            obj.put("telefono", cfSgt.getTelefono());
            obj.put("DNI", cfSgt.getDNI());
            obj.put("email", cfSgt.getEmail());
            obj.put("contrasenia", cfSgt.getContrasenia());
            arregloChofer.add(obj);
        }
        return arregloChofer;
    };
    public JSONArray PasajeroToJSON() {
        JSONArray arregloPasajero = new JSONArray();
        Enumeration<Pasajero> ps = Collections.enumeration(pasajeros);
        while(ps.hasMoreElements()){
            Pasajero psjSgt = ps.nextElement();
            JSONObject obj = new JSONObject();
            obj.put("nombres", psjSgt.getNombres());
            obj.put("apellidoPat", psjSgt.getApellidoPat());
            obj.put("apellidoMat", psjSgt.getApellidoMat());
            obj.put("genero", psjSgt.getGenero());
            obj.put("telefono", psjSgt.getTelefono());
            obj.put("DNI", psjSgt.getDNI());
            obj.put("email", psjSgt.getEmail());
            obj.put("contrasenia", psjSgt.getContrasenia());
            arregloPasajero.add(obj);
        }
        return arregloPasajero;
    }
    public void iniciarSesion(String email, String contrasenia){

        //ArrayList<Chofer> cf = new ArrayList<Chofer>();
        //ArrayList<Pasajero> psj = new ArrayList<Pasajero>();
        JSONObject obj = new JSONObject();
        obj.put("email", email);
        obj.put("contrasenia", contrasenia);
        int size = choferes.size();
        for(int i=0; i<size; i++){
            if(obj.equals(choferes.get(i))){
                System.out.println("Contraseña correcta");
            }
            else if (i==size-1){
                System.out.println("Contraseña correcta");
            }
        }
    }
}
