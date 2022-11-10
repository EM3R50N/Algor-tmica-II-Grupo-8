package processes;
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
            obj.put("email", psjSgt.getEmail());
            obj.put("contrasenia", psjSgt.getContrasenia());
            arregloPasajero.add(obj);
        }
        return arregloPasajero;
    }
}
