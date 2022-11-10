package persistencia;
import entities.Chofer;
import entities.Pasajero;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject; //leer
import org.json.simple.parser.JSONParser; //leer

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.parser.ParseException;
import processes.registroConfig;

public class JSONConfig implements Persitencia{
    private String filename;
    public JSONConfig() {
        this.filename = "config.json";
    };
    public void guardarConfig(registroConfig config){
        JSONObject JSonConfig = new JSONObject();
        JSonConfig.put("Chofer", config.ChoferToJSON());
        JSonConfig.put("Chofer", config.PasajeroToJSON());
        try{
            FileWriter writer = new FileWriter(this.filename);
            writer.write(JSonConfig.toJSONString());
            writer.flush();
        }catch(IOException e){
            System.out.println("Exception" + e);
        }
    };
    public void leerConfig(registroConfig config){
        JSONParser parser = new JSONParser();
        try{
            FileReader lector = new FileReader(this.filename);
            JSONObject jsonObject = (JSONObject) parser.parse(lector);
            leerChofer(jsonObject, config);
            leerPasajero(jsonObject, config);
        } catch (FileNotFoundException e){
            System.out.println("Exception" + e);
        }catch (IOException e){
            System.out.println("Exception" + e);
        } catch (ParseException e){
            System.out.println("Exception" + e);
        }
    }
    private void leerPasajero(JSONObject jsonObject, registroConfig config){
        JSONArray pasajeroJSONArray = (JSONArray) jsonObject.get("Pasajero");
        Iterator it = pasajeroJSONArray.iterator();
        while(it.hasNext()){
            JSONObject pasajero = (JSONObject) it.next();
            String nombre = (String)pasajero.get("nombre");
            String apellidoPaterno = (String)pasajero.get("apellidoPat");
            String apellidoMaterno = (String)pasajero.get("apellidoMat");
            char genero = (char)pasajero.get("Genero");
            String telefono = (String)pasajero.get("telefono");
            String DNI = (String)pasajero.get("DNI");
            String email = (String)pasajero.get("email");
            String contrasenia = (String)pasajero.get("contrasenia");
            Pasajero pas = new Pasajero(nombre, apellidoPaterno, apellidoMaterno, genero, telefono, DNI, email, contrasenia);
            config.crearPasajero(pas);
            System.out.println(pas.NombreCompleto());
        }
    };
    private void leerChofer(JSONObject jsonObject, registroConfig config){
        JSONArray choferJSONArray = (JSONArray) jsonObject.get("Chofer");
        Iterator it = choferJSONArray.iterator();
        while(it.hasNext()){
            JSONObject chofer = (JSONObject) it.next();
            String nombre = (String)chofer.get("nombre");
            String apellidoPaterno = (String)chofer.get("apellidoPat");
            String apellidoMaterno = (String)chofer.get("apellidoMat");
            char genero = (char)chofer.get("Genero");
            String telefono = (String)chofer.get("telefono");
            String DNI = (String)chofer.get("DNI");
            String email = (String)chofer.get("email");
            String contrasenia = (String)chofer.get("contrasenia");
            Chofer chof = new Chofer(nombre, apellidoPaterno, apellidoMaterno, genero, telefono, DNI, email, contrasenia);
            config.crearChofer(chof);
            System.out.println(chof.NombreCompleto());
        }
    };
};
