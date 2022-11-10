package persistencia;
import processes.registroConfig;

public interface Persitencia {
    void guardarConfig(registroConfig config);
    void leerConfig(registroConfig config);
}
